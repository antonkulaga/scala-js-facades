package org.denigma.threejs.extensions.animations

import java.util.Date

import org.scalajs.dom
import Animation.{Started, AniState}
import scala.concurrent.duration.Duration
import scala.scalajs.js


class Scheduler
{
  def current = js.Date.now

  var animations = List.empty[Animation]

  def add(ani:Animation) = {
    this.animations = ani::animations
    ani.state = Animation.Running(current)
  }

  def tick() = 
  {
    val now = current
    animations.foreach{ani=>
      ani.state match {
        case Animation.Running(start)=> ani(now)
        case other =>
          //dom.console.info(other.toString)
         //do nothing
      }
    }
  }

  protected def onEnterFrameFunction(double: Double): Unit = {
    this.tick()
    start()
  }



  def start() =    {
    dom.requestAnimationFrame(  onEnterFrameFunction _ )
    this
  }


}

object Easings {
  
  val linear:Double=>Double = i=>i

}

/**
 * contains states of animations and some other useful stuff
 */
object Animation{
  trait AniState
  trait Started extends AniState{
    def start:Double

  }
//  trait Active extends Started{
//    def position:Double
//  }
  case object Stopped extends AniState
  case class Finished(start:Double) extends Started
  case class Paused(start:Double) extends Started
  case class Running(start:Double) extends Started
  case class Backward(start:Double,finished:Double) extends Started
  
  //def apply(length:Duration,easing:Double=>Double = i=>i)(fun:(Double=>Unit)):Animation= new Animation(length,easing)(fun)

}


class Animation(val length:Duration,easing:Double=>Double = Easings.linear)(fun:(Double=>Unit))
{

  lazy val lengthMillis: Long = length.toMillis

  var state:AniState = Animation.Stopped

  def apply(current:Double) =    state match {
    case st:Started=>
      val finish:Double = st.start +this.lengthMillis
       easing( 1.0-(finish-current)/length.toMillis) match{
         case p if p>=1.0=>
           fun(1.0)
           this.state = Animation.Finished(current)
         case p if p < 0.0=>
           dom.console.error(s"animation percent is $p that is below zero!\n " +
             s"Current time is $current, start is ${st.start} and length is $lengthMillis")
           this.state = Animation.Finished(current)

         case p=>
           fun(p)
           //dom.console.info( s"Current time is $current, start is ${st.start} and length is $lengthMillis and percent is $p")

       }

    case _=> dom.console.error("trying to run an operation that has not started")
  }


  def go(implicit scheduler:Scheduler) = {
    scheduler.add(this)
  }



}
