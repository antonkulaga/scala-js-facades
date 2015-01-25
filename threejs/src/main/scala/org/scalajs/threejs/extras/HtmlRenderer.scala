package org.scalajs.threejs.extras

import org.scalajs.dom.HTMLElement
import org.scalajs.threejs
import org.scalajs.threejs._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("THREE.CSS3DObject")
class HtmlObject(element:HTMLElement) extends Object3D
{

}

@JSName("THREE.CSS3DSprite")
class HtmlSprite(element:HTMLElement) extends HtmlObject(element){

}


@JSName("THREE.CSS3DRenderer")
class HtmlRenderer extends Renderer {

//  def render(scene: Scene, camera: Camera): Unit = js.native
//  def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
//  var domElement: HTMLCanvasElement = js.native
  //def this(parameters: WebGLRendererParameters = js.native) = this()

  def setSize(width:Double,height:Double):Unit = js.native

  def epsilon(value:Double):Double = js.native

  def getObjectCSSMatrix(matrix:threejs.Matrix3):String= js.native

  def getCameraCSSMatrix(matrix:threejs.Matrix3):String= js.native

  def renderObject(obj:HtmlObject,camera:Camera):Unit = js.native


}
