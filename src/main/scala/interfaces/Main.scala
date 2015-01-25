package interfaces

import interfaces.examples.{ThreeJSExample, CodeMirrorExample, Logged}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@JSExport(name="Main")
object Main extends js.JSApp with Logged
{
  var examples = CodeMirrorExample::ThreeJSExample::Nil

  @JSExport
  def main(): Unit = {

    val url = dom.document.URL.toLowerCase
    examples.find(e=>url.contains(e.name.toLowerCase)) match {
      case Some(e)=> e.main()
      case None=> debug(s"no main method found for $url")
    }
  }

}


