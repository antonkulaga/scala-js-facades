package interfaces.examples

import org.scalajs.dom
import org.scalajs.dom.HTMLElement
import org.scalajs.threejs._
import org.scalajs.threejs.extensions.Container3D
import org.scalajs.threejs.extras.HtmlSprite

import scala.scalajs.js
import scala.util.Random
import scalatags.JsDom.all._

object ThreeJSExample extends Example
{
  override def name: String = "threejs"




  lazy val demo = new ExampleScene(dom.document.body,1280,768)


  override def main(): Unit = {

    demo.render()


  }
}

class ExampleScene(val container:HTMLElement, val height:Double, val width:Double) extends Container3D{
  val geometry = new BoxGeometry( 400, 400, 400 )

  val params = js.Dynamic.literal(
    color =  0xff000,
    wireframe = true
  ).asInstanceOf[MeshBasicMaterialParameters]

  val material = new MeshBasicMaterial( params )

  val mesh: Mesh = new Mesh( geometry, material )
  val colors = List("green","red","blue","orange","purple","teal")
  val colorMap= Map("green"->0xA1CF64,"red"->0xD95C5C,"blue" -> 0x6ECFF5,"orange" ->0xF05940,"purple"->0x564F8A,"teal"->0x00B5AD)

  def randColorName = colors(Random.nextInt(colors.size))

  protected def nodeTagFromTitle(title:String,colorName:String) =  div(title,   `class`:=s"ui large ${colorName} message", margin := "0px",
  textarea("it renders html to 3d scene")).render

  scene.add(mesh)

  val helloHtml = nodeTagFromTitle("hello three.js and ScalaJS!",randColorName)
  val html = new HtmlSprite(helloHtml)
  html.position.y = -300
  cssScene.add(html)


}
