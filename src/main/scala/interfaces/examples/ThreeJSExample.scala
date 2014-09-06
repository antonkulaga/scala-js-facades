package interfaces.examples

import org.scalajs.dom
import org.scalajs.threejs._

import scala.scalajs.js

object ThreeJSExample extends Example
{
  override def name: String = "threejs"

  val scene = new Scene()

  val camera = new PerspectiveCamera( 75, dom.window.innerWidth / dom.window.innerHeight, 1, 10000 )
  camera.position.z = 1000

  val geometry = new BoxGeometry( 200, 200, 200 )

  val params = js.Dynamic.literal(
    color =  0xff000,
    wireframe = true
  ).asInstanceOf[MeshBasicMaterialParameters]

  val material = new MeshBasicMaterial( params )

  val mesh: Mesh = new Mesh( geometry, material )

  val renderer = new CanvasRenderer()


  override def main(): Unit = {

    scene.add( mesh )


    val w = dom.window.innerWidth
    val h = dom.window.innerHeight
    renderer.setSize( w, h )

    dom.document.body.appendChild( renderer.domElement )

    renderer.render( scene, camera )

    animate()

  }

  def animate(double:Double = 0):js.Any =
  {
      mesh.rotation.x += 0.01
      mesh.rotation.y += 0.02
      renderer.render( scene, camera )
      dom.requestAnimationFrame( animate _ )

  }
}
