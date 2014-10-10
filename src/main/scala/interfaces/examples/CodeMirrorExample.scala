package interfaces.examples

import org.scalajs.codemirror.{EditorConfiguration, CodeMirror}
import org.scalajs.dom
import org.scalajs.dom.HTMLTextAreaElement

import scala.scalajs.js

/**
 * Code mirror example
 */
object CodeMirrorExample  extends Example{

  val name:String = "codemirror"

  override def main(): Unit = {
    val params = js.Dynamic.literal(
      mode = "text/html",
      lineNumbers = true
    ).asInstanceOf[EditorConfiguration]

    val text =     """
                     |<h1 class="ui header"> CodeMirror ScalaJS wrapper works!</h1>
                     |It was initialized from ScalaJS code
                   """.stripMargin

    val code = dom.document.getElementById("code") match {
      case el:HTMLTextAreaElement =>
        val m = CodeMirror.fromTextArea(el,params)
        m.getDoc().setValue(text)
      case _=> error("cannot find text area for the code")
    }

  }
}
