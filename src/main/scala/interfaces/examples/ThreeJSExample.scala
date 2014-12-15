package interfaces.examples

import org.scalajs.dom
import org.scalajs.dom.{MouseEvent, HTMLElement}
import org.scalajs.threejs._
import org.scalajs.threejs.extensions.controls.{JumpCameraControls, IntersectionControls, HoverControls, CameraControls}
import org.scalajs.threejs.extensions.Container3D
import org.scalajs.threejs.extras.HtmlSprite

import scala.scalajs.js
import scala.scalajs.js.Array
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

class ExampleScene(val container:HTMLElement, val width:Double, val height:Double) extends Container3D
{
  val geometry = new BoxGeometry( 350, 300, 250 )


  val colors = List("green","red","blue","orange","purple","teal")
  val colorMap= Map("green"->0xA1CF64,"red"->0xD95C5C,"blue" -> 0x6ECFF5,"orange" ->0xF05940,"purple"->0x564F8A,"teal"->0x00B5AD)

  def materialParams(name:String) = js.Dynamic.literal(
    color = new Color().setHex(colorMap(name))
   // wireframe = true
  ).asInstanceOf[MeshLambertMaterialParameters]

  def randColorName = colors(Random.nextInt(colors.size))

  protected def nodeTagFromTitle(title:String,colorName:String) =  textarea(title,`class`:=s"ui large ${colorName} message").render


  var meshes = addMesh(new Vector3(0,0,0))::addMesh(new Vector3(400,0,200))::addMesh(new Vector3(-400,0,200))::Nil

  var sprites = List.empty[HtmlSprite]

  override val controls:CameraControls = new ExampleControls(camera,this.container,scene,width,height,this.meshes.head.position.clone())

  val light = new DirectionalLight( 0xffffff, 2 )
  light.position.set( 1, 1, 1 ).normalize()
  scene.add( light )


  def addMesh(pos:Vector3 = new Vector3()) = {
    val material = new MeshLambertMaterial( this.materialParams(randColorName) )
    val mesh: Mesh = new Mesh( geometry, material )
    mesh.name = pos.toString
    mesh.position.set(pos.x,pos.y,pos.z)
    mesh
  }

  def addLabel(pos:Vector3,title:String = "hello three.js and ScalaJS!") = {
    val helloHtml = nodeTagFromTitle(title,randColorName)
    val html = new HtmlSprite(helloHtml)
    html.position.set(pos.x,pos.y,pos.z)
    html
  }

  meshes.foreach(scene.add)
  meshes.zipWithIndex.foreach{case (m,i)=>
    this.sprites =  addLabel(m.position.clone().setY(m.position.y+200),"Text #"+i)::this.sprites

  }
  sprites.foreach(cssScene.add)


}

/**
 * Just shows that some effects are working
 * @param cam
 * @param el
 * @param sc
 * @param center
 */
class ExampleControls(cam:Camera, el:HTMLElement, sc:Scene, width:Double,height:Double,  center:Vector3 = new Vector3()) extends JumpCameraControls(cam,el,sc,width,height,center)
{

  override def onMouseMove(event:MouseEvent) = {
    this.onCursorMove(event.clientX,event.clientY,width,height)
    enter.keys.foreach{
        case m:Mesh=>
          m.material match
          {
            case mat:MeshLambertMaterial=>      mat.wireframe = true
            case _=> //do nothing
          }

        case _ => //do nothing
    }

    exit.keys.foreach{
      case m:Mesh=>
        m.material match
        {
          case mat:MeshLambertMaterial=>      mat.wireframe = false
          case _=> //do nothing
        }

      case _ => //do nothing
    }

    rotateOnMove(event)

  }


}
