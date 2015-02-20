package org.denigma.threejs.extensions.controls

import org.denigma.threejs._
import org.scalajs.dom


trait IntersectionControls
{
  def camera:Camera
  def scene:Object3D

  val projector = new Projector()
  val raycaster = new Raycaster()

  var intersections = List.empty[Intersection]
  var underMouse = Map.empty[Object3D, List[Intersection]]
  var last = Map.empty[Object3D, List[Intersection]]
  var exit = Map.empty[Object3D, List[Intersection]]
  var enter = Map.empty[Object3D, List[Intersection]]


  def findIntersections(x:Double,y:Double) =
  {
    val vector = new Vector3( x, y, 1 )
    projector.unprojectVector( vector, camera )
    raycaster.set( camera.position, vector.sub( camera.position ).normalize() )
    raycaster.intersectObjects( scene.children ).sortWith( (a,b)=>a.point.distanceTo(vector)<b.point.distanceTo(vector)).toList
  }


  def onCursorMove(clientX:Double,clientY:Double,width:Double,height:Double) =
  {
    val mouseX = ( clientX / width) * 2 - 1
    val mouseY = - ( clientY / height ) * 2 + 1
    intersections = findIntersections(mouseX,mouseY)
    underMouse   = intersections.groupBy(_.`object`).toMap
    val l = last // if I do not do this assigment and use last instead of l I get into trouble
    this.exit = l.filterKeys(!underMouse.contains(_)).toMap
    this.enter = underMouse.filterKeys(!l.contains(_)).toMap
    //if(exit.exists{case (key,value)=>enter.contains(key)}) dom.console.error("same enterexit")
    val s = enter.size
    last = underMouse
    if(s!=enter.size) dom.console.error("ScalaJS error with immutable collections")

  }

}
