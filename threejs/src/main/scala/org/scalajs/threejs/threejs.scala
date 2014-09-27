package org.scalajs.threejs

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation._

trait WebGLRenderingContext extends js.Object {
}

package object THREE extends js.Object {
  var REVISION: String = ???
  var CullFaceNone: CullFace = ???
  var CullFaceBack: CullFace = ???
  var CullFaceFront: CullFace = ???
  var CullFaceFrontBack: CullFace = ???
  var FrontFaceDirectionCW: FrontFaceDirection = ???
  var FrontFaceDirectionCCW: FrontFaceDirection = ???
  var BasicShadowMap: ShadowMapType = ???
  var PCFShadowMap: ShadowMapType = ???
  var PCFSoftShadowMap: ShadowMapType = ???
  var FrontSide: Side = ???
  var BackSide: Side = ???
  var DoubleSide: Side = ???
  var NoShading: Shading = ???
  var FlatShading: Shading = ???
  var SmoothShading: Shading = ???
  var NoColors: Colors = ???
  var FaceColors: Colors = ???
  var VertexColors: Colors = ???
  var NoBlending: Blending = ???
  var NormalBlending: Blending = ???
  var AdditiveBlending: Blending = ???
  var SubtractiveBlending: Blending = ???
  var MultiplyBlending: Blending = ???
  var CustomBlending: Blending = ???
  var AddEquation: BlendingEquation = ???
  var SubtractEquation: BlendingEquation = ???
  var ReverseSubtractEquation: BlendingEquation = ???
  var ZeroFactor: BlendingDstFactor = ???
  var OneFactor: BlendingDstFactor = ???
  var SrcColorFactor: BlendingDstFactor = ???
  var OneMinusSrcColorFactor: BlendingDstFactor = ???
  var SrcAlphaFactor: BlendingDstFactor = ???
  var OneMinusSrcAlphaFactor: BlendingDstFactor = ???
  var DstAlphaFactor: BlendingDstFactor = ???
  var OneMinusDstAlphaFactor: BlendingDstFactor = ???
  var DstColorFactor: BlendingSrcFactor = ???
  var OneMinusDstColorFactor: BlendingSrcFactor = ???
  var SrcAlphaSaturateFactor: BlendingSrcFactor = ???
  var MultiplyOperation: Combine = ???
  var MixOperation: Combine = ???
  var AddOperation: Combine = ???
  var UVMapping: MappingConstructor = ???
  var CubeReflectionMapping: MappingConstructor = ???
  var CubeRefractionMapping: MappingConstructor = ???
  var SphericalReflectionMapping: MappingConstructor = ???
  var SphericalRefractionMapping: MappingConstructor = ???
  var RepeatWrapping: Wrapping = ???
  var ClampToEdgeWrapping: Wrapping = ???
  var MirroredRepeatWrapping: Wrapping = ???
  var NearestFilter: TextureFilter = ???
  var NearestMipMapNearestFilter: TextureFilter = ???
  var NearestMipMapLinearFilter: TextureFilter = ???
  var LinearFilter: TextureFilter = ???
  var LinearMipMapNearestFilter: TextureFilter = ???
  var LinearMipMapLinearFilter: TextureFilter = ???
  var UnsignedByteType: TextureDataType = ???
  var ByteType: TextureDataType = ???
  var ShortType: TextureDataType = ???
  var UnsignedShortType: TextureDataType = ???
  var IntType: TextureDataType = ???
  var UnsignedIntType: TextureDataType = ???
  var FloatType: TextureDataType = ???
  var UnsignedShort4444Type: PixelType = ???
  var UnsignedShort5551Type: PixelType = ???
  var UnsignedShort565Type: PixelType = ???
  var AlphaFormat: PixelFormat = ???
  var RGBFormat: PixelFormat = ???
  var RGBAFormat: PixelFormat = ???
  var LuminanceFormat: PixelFormat = ???
  var LuminanceAlphaFormat: PixelFormat = ???
  var RGB_S3TC_DXT1_Format: CompressedPixelFormat = ???
  var RGBA_S3TC_DXT1_Format: CompressedPixelFormat = ???
  var RGBA_S3TC_DXT3_Format: CompressedPixelFormat = ???
  var RGBA_S3TC_DXT5_Format: CompressedPixelFormat = ???
  var Math: Math = ???
  var LineStrip: LineType = ???
  var LinePieces: LineType = ???
  var ShaderChunk: ShaderChunk = ???
}

sealed trait CullFace extends js.Object {
}

@JSName("THREE.CullFace")
object CullFace extends js.Object {
  @JSBracketAccess
  def apply(value: CullFace): String = ???
}

sealed trait FrontFaceDirection extends js.Object {
}

@JSName("THREE.FrontFaceDirection")
object FrontFaceDirection extends js.Object {
  @JSBracketAccess
  def apply(value: FrontFaceDirection): String = ???
}

sealed trait ShadowMapType extends js.Object {
}

@JSName("THREE.ShadowMapType")
object ShadowMapType extends js.Object {
  @JSBracketAccess
  def apply(value: ShadowMapType): String = ???
}

sealed trait Side extends js.Object {
}

@JSName("THREE.Side")
object Side extends js.Object {
  @JSBracketAccess
  def apply(value: Side): String = ???
}

sealed trait Shading extends js.Object {
}

@JSName("THREE.Shading")
object Shading extends js.Object {
  @JSBracketAccess
  def apply(value: Shading): String = ???
}

sealed trait Colors extends js.Object {
}

@JSName("THREE.Colors")
object Colors extends js.Object {
  @JSBracketAccess
  def apply(value: Colors): String = ???
}

sealed trait Blending extends js.Object {
}

@JSName("THREE.Blending")
object Blending extends js.Object {
  @JSBracketAccess
  def apply(value: Blending): String = ???
}

sealed trait BlendingEquation extends js.Object {
}

@JSName("THREE.BlendingEquation")
object BlendingEquation extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingEquation): String = ???
}

sealed trait BlendingDstFactor extends js.Object {
}

@JSName("THREE.BlendingDstFactor")
object BlendingDstFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingDstFactor): String = ???
}

sealed trait BlendingSrcFactor extends js.Object {
}

@JSName("THREE.BlendingSrcFactor")
object BlendingSrcFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingSrcFactor): String = ???
}

sealed trait Combine extends js.Object {
}

@JSName("THREE.Combine")
object Combine extends js.Object {
  @JSBracketAccess
  def apply(value: Combine): String = ???
}

sealed trait Mapping extends js.Object {
}

@JSName("THREE.Mapping")
object Mapping extends js.Object {
  @JSBracketAccess
  def apply(value: Mapping): String = ???
}

trait MappingConstructor extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Mapping),List())))) */
}

sealed trait Wrapping extends js.Object {
}

@JSName("THREE.Wrapping")
object Wrapping extends js.Object {
  @JSBracketAccess
  def apply(value: Wrapping): String = ???
}

sealed trait TextureFilter extends js.Object {
}

@JSName("THREE.TextureFilter")
object TextureFilter extends js.Object {
  @JSBracketAccess
  def apply(value: TextureFilter): String = ???
}

sealed trait TextureDataType extends js.Object {
}

@JSName("THREE.TextureDataType")
object TextureDataType extends js.Object {
  @JSBracketAccess
  def apply(value: TextureDataType): String = ???
}

sealed trait PixelType extends js.Object {
}

@JSName("THREE.PixelType")
object PixelType extends js.Object {
  @JSBracketAccess
  def apply(value: PixelType): String = ???
}

sealed trait PixelFormat extends js.Object {
}

@JSName("THREE.PixelFormat")
object PixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: PixelFormat): String = ???
}

sealed trait CompressedPixelFormat extends js.Object {
}

@JSName("THREE.CompressedPixelFormat")
object CompressedPixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: CompressedPixelFormat): String = ???
}

@JSName("THREE.Camera")
class Camera extends Object3D {
  var matrixWorldInverse: Matrix4 = ???
  var projectionMatrix: Matrix4 = ???
  override def lookAt(vector: Vector3): Unit = ???
  def clone(camera: Camera): Camera = ???
}

@JSName("THREE.CubeCamera")
class CubeCamera  extends Object3D {
  def this(near: Double = ???, far: Double = ???, cubeResolution: Double = ???) = this()
  var renderTarget: WebGLRenderTargetCube = ???
  def updateCubeMap(renderer: Renderer, scene: Scene): Unit = ???
}

@JSName("THREE.OrthographicCamera")
class OrthographicCamera  extends Camera {
  def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double) = this()
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double) = this()
  var left: Double = ???
  var right: Double = ???
  var top: Double = ???
  var bottom: Double = ???
  var near: Double = ???
  var far: Double = ???
  def updateProjectionMatrix(): Unit = ???
  override def clone(): OrthographicCamera = ???
}

@JSName("THREE.PerspectiveCamera")
class PerspectiveCamera  extends Camera {
  def this(fov: Double = ???, aspect: Double = ???, near: Double = ???, far: Double = ???) = this()
  var fov: Double = ???
  var aspect: Double = ???
  var near: Double = ???
  var far: Double = ???
  def setLens(focalLength: Double, frameHeight: Double = ???): Unit = ???
  def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = ???
  def updateProjectionMatrix(): Unit = ???
  override def clone(): PerspectiveCamera = ???
}

@JSName("THREE.BufferAttribute")
class BufferAttribute  extends js.Object {
  def this(array: js.Any, itemSize: Double) = this()
  var array: js.Array[Double] = ???
  var itemSize: Double = ???
  var length: Double = ???
  def set(value: Double): BufferAttribute = ???
  def setX(index: Double, x: Double): BufferAttribute = ???
  def setY(index: Double, y: Double): BufferAttribute = ???
  def setZ(index: Double, z: Double): BufferAttribute = ???
  def setXY(index: Double, x: Double, y: Double): BufferAttribute = ???
  def setXYZ(index: Double, x: Double, y: Double, z: Double): BufferAttribute = ???
  def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): BufferAttribute = ???
}

@JSName("THREE.Int8Attribute")
class Int8Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Uint8Attribute")
class Uint8Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Uint8ClampedAttribute")
class Uint8ClampedAttribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Int16Attribute")
class Int16Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Uint16Attribute")
class Uint16Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Int32Attribute")
class Int32Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Uint32Attribute")
class Uint32Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Float32Attribute")
class Float32Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.Float64Attribute")
class Float64Attribute  extends BufferAttribute {
  def this(data: js.Any, itemSize: Double) = this()
}

@JSName("THREE.BufferGeometry")
class BufferGeometry extends js.Object {
  var id: Double = ???
  var uuid: String = ???
  var name: String = ???
  var attributes: js.Array[BufferAttribute] = ???
  var drawcalls: js.Any = ???
  var offsets: js.Any = ???
  var boundingBox: BoundingBox3D = ???
  var boundingSphere: BoundingSphere = ???
  def addAttribute(name: String, attribute: BufferAttribute): js.Dynamic = ???
  def addAttribute(name: String, array: js.Any, itemSize: Double): js.Dynamic = ???
  def getAttribute(name: String): js.Dynamic = ???
  def addDrawCall(start: Double, count: Double, index: Double): Unit = ???
  def applyMatrix(matrix: Matrix4): Unit = ???
  def fromGeometry(geometry: Geometry, settings: js.Any = ???): BufferGeometry = ???
  def computeBoundingBox(): Unit = ???
  def computeBoundingSphere(): Unit = ???
  def computeFaceNormals(): Unit = ???
  def computeVertexNormals(): Unit = ???
  def computeTangents(): Unit = ???
  def computeOffsets(indexBufferSize: Double): Unit = ???
  def merge(): Unit = ???
  def normalizeNormals(): Unit = ???
  def reorderBuffers(indexBuffer: Double, indexMap: js.Array[Double], vertexCount: Double): Unit = ???
  override def clone(): BufferGeometry = ???
  def dispose(): Unit = ???
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

@JSName("THREE.Clock")
class Clock  extends js.Object {
  def this(autoStart: Boolean = ???) = this()
  var autoStart: Boolean = ???
  var startTime: Double = ???
  var oldTime: Double = ???
  var elapsedTime: Double = ???
  var running: Boolean = ???
  def start(): Unit = ???
  def stop(): Unit = ???
  def getElapsedTime(): Double = ???
  def getDelta(): Double = ???
}

@JSName("THREE.EventDispatcher")
class EventDispatcher extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

@JSName("THREE.Face3")
class Face3  extends js.Object {
  def this(a: Double, b: Double, c: Double) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color, materialIndex: Double) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, vertexColors: js.Array[Color]) = this()
  def this(a: Double, b: Double, c: Double, normal: Vector3, vertexColors: js.Array[Color], materialIndex: Double) = this()
  def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3], color: Color, materialIndex: Double) = this()
  def this(a: Double, b: Double, c: Double, vertexNormals: js.Array[Vector3], vertexColors: js.Array[Color], materialIndex: Double) = this()
  var a: Double = ???
  var b: Double = ???
  var c: Double = ???
  var normal: Vector3 = ???
  var vertexNormals: js.Array[Vector3] = ???
  var color: Color = ???
  var vertexColors: js.Array[Color] = ???
  var vertexTangents: js.Array[Double] = ???
  var materialIndex: Double = ???
  override def clone(): Face3 = ???
}

trait MorphTarget extends js.Object {
  var name: String = ???
  var vertices: js.Array[Vector3] = ???
}

trait MorphColor extends js.Object {
  var name: String = ???
  var colors: js.Array[Color] = ???
}

trait MorphNormals extends js.Object {
  var name: String = ???
  var normals: js.Array[Vector3] = ???
}

trait BoundingBox3D extends js.Object {
  var min: Vector3 = ???
  var max: Vector3 = ???
}

trait BoundingSphere extends js.Object {
  var radius: Double = ???
}

@JSName("THREE.Geometry")
class Geometry extends js.Object {
  var id: Double = ???
  var uuid: String = ???
  var name: String = ???
  var vertices: js.Array[Vector3] = ???
  var colors: js.Array[Color] = ???
  var faces: js.Array[Face3] = ???
  var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = ???
  var morphTargets: js.Array[MorphTarget] = ???
  var morphColors: js.Array[MorphColor] = ???
  var morphNormals: js.Array[MorphNormals] = ???
  var skinWeights: js.Array[Double] = ???
  var skinIndices: js.Array[Double] = ???
  var lineDistances: js.Array[Double] = ???
  var boundingBox: BoundingBox3D = ???
  var boundingSphere: BoundingSphere = ???
  var hasTangents: Boolean = ???
  var dynamic: Boolean = ???
  var verticesNeedUpdate: Boolean = ???
  var elementsNeedUpdate: Boolean = ???
  var uvsNeedUpdate: Boolean = ???
  var normalsNeedUpdate: Boolean = ???
  var tangentsNeedUpdate: Boolean = ???
  var colorsNeedUpdate: Boolean = ???
  var lineDistancesNeedUpdate: Boolean = ???
  var buffersNeedUpdate: Boolean = ???
  var groupsNeedUpdate: Boolean = ???
  def applyMatrix(matrix: Matrix4): Unit = ???
  def center(): Vector3 = ???
  def computeFaceNormals(): Unit = ???
  def computeVertexNormals(areaWeighted: Boolean = ???): Unit = ???
  def computeMorphNormals(): Unit = ???
  def computeTangents(): Unit = ???
  def computeLineDistances(): Unit = ???
  def computeBoundingBox(): Unit = ???
  def computeBoundingSphere(): Unit = ???
  def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: Double): Unit = ???
  def mergeVertices(): Double = ???
  def makeGroups(usesFaceMaterial: Boolean, maxVerticesInGroup: Double): Unit = ???
  override def clone(): Geometry = ???
  def dispose(): Unit = ???
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

@JSName("THREE.Object3D")
class Object3D extends js.Object {
  var id: Double = ???
  var uuid: String = ???
  var name: String = ???
  var parent: Object3D = ???
  var children: js.Array[Object3D] = ???
  var up: Vector3 = ???
  var position: Vector3 = ???
  var rotation: Euler = ???
  var quaternion: Quaternion = ???
  var scale: Vector3 = ???
  var renderDepth: Double = ???
  var rotationAutoUpdate: Boolean = ???
  var matrix: Matrix4 = ???
  var matrixWorld: Matrix4 = ???
  var matrixAutoUpdate: Boolean = ???
  var matrixWorldNeedsUpdate: Boolean = ???
  var visible: Boolean = ???
  var castShadow: Boolean = ???
  var receiveShadow: Boolean = ???
  var frustumCulled: Boolean = ???
  var userData: js.Any = ???
  var eulerOrder: String = ???
  def applyMatrix(matrix: Matrix4): Unit = ???
  def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = ???
  def setRotationFromEuler(euler: Euler): Unit = ???
  def setRotationFromMatrix(m: Matrix4): Unit = ???
  def setRotationFromQuaternion(q: Quaternion): Unit = ???
  def rotateOnAxis(axis: Vector3, angle: Double): Object3D = ???
  def rotateX(angle: Double): Object3D = ???
  def rotateY(angle: Double): Object3D = ???
  def rotateZ(angle: Double): Object3D = ???
  def translateOnAxis(axis: Vector3, distance: Double): Object3D = ???
  def translate(distance: Double, axis: Vector3): Object3D = ???
  def translateX(distance: Double): Object3D = ???
  def translateY(distance: Double): Object3D = ???
  def translateZ(distance: Double): Object3D = ???
  def localToWorld(vector: Vector3): Vector3 = ???
  def worldToLocal(vector: Vector3): Vector3 = ???
  def lookAt(vector: Vector3): Unit = ???
  def add(`object`: Object3D): Unit = ???
  def remove(`object`: Object3D): Unit = ???
  def raycast(raycaster: Raycaster, intersects: js.Any): Unit = ???
  def traverse(callback: js.Function1[Object3D, Any]): Unit = ???
  def getObjectById(id: String, recursive: Boolean): Object3D = ???
  def getObjectByName(name: String, recursive: Boolean = ???): Object3D = ???
  def getChildByName(name: String, recursive: Boolean = ???): Object3D = ???
  def updateMatrix(): Unit = ???
  def updateMatrixWorld(force: Boolean): Unit = ???
  def updateMatrixWorld(): Unit = ???
  def clone(`object`: Object3D = ???, recursive: Boolean = ???): Object3D = ???
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

@JSName("THREE.Object3D")
object Object3D extends js.Object {
  var DefaultUp: Vector3 = ???
}

@JSName("THREE.Projector")
class Projector extends js.Object {
  def projectVector(vector: Vector3, camera: Camera): Vector3 = ???
  def unprojectVector(vector: Vector3, camera: Camera): Vector3 = ???
  def pickingRay(vector: Vector3, camera: Camera): Raycaster = ???
  def projectScene(scene: Scene, camera: Camera, sortObjects: Boolean, sortElements: Boolean = ???): js.Any = ???
}

trait Intersection extends js.Object {
  var distance: Double = ???
  var point: Vector3 = ???
  var face: Face3 = ???
  var `object`: Object3D = ???
}

trait RaycasterParameters extends js.Object {
  var Sprite: js.Any = ???
  var Mesh: js.Any = ???
  var PointCloud: js.Any = ???
  var LOD: js.Any = ???
  var Line: js.Any = ???
}

@JSName("THREE.Raycaster")
class Raycaster  extends js.Object {
  def this(origin: Vector3 = ???, direction: Vector3 = ???, near: Double = ???, far: Double = ???) = this()
  var ray: Ray = ???
  var near: Double = ???
  var far: Double = ???
  var params: RaycasterParameters = ???
  var precision: Double = ???
  var linePrecision: Double = ???
  def set(origin: Vector3, direction: Vector3): Unit = ???
  def intersectObject(`object`: Object3D, recursive: Boolean = ???): js.Array[Intersection] = ???
  def intersectObjects(objects: js.Array[Object3D], recursive: Boolean = ???): js.Array[Intersection] = ???
}

@JSName("THREE.Light")
class Light  extends Object3D {
  def this(hex: Double = ???) = this()
  var color: Color = ???
  def clone(light: Light): Light = ???
}

@JSName("THREE.AmbientLight")
class AmbientLight  extends Light {
  def this(hex: Double = ???) = this()
  override def clone(): AmbientLight = ???
}

@JSName("THREE.AreaLight")
class AreaLight  extends Light {
  def this(hex: Double, intensity: Double = ???) = this()
  var normal: Vector3 = ???
  var right: Vector3 = ???
  var intensity: Double = ???
  var width: Double = ???
  var height: Double = ???
  var constantAttenuation: Double = ???
  var linearAttenuation: Double = ???
  var quadraticAttenuation: Double = ???
}

@JSName("THREE.DirectionalLight")
class DirectionalLight  extends Light {
  def this(hex: Double = ???, intensity: Double = ???) = this()
  var target: Object3D = ???
  var intensity: Double = ???

  var onlyShadow: Boolean = ???
  var shadowCameraNear: Double = ???
  var shadowCameraFar: Double = ???
  var shadowCameraLeft: Double = ???
  var shadowCameraRight: Double = ???
  var shadowCameraTop: Double = ???
  var shadowCameraBottom: Double = ???
  var shadowCameraVisible: Boolean = ???
  var shadowBias: Double = ???
  var shadowDarkness: Double = ???
  var shadowMapWidth: Double = ???
  var shadowMapHeight: Double = ???
  var shadowCascade: Boolean = ???
  var shadowCascadeOffset: Vector3 = ???
  var shadowCascadeCount: Double = ???
  var shadowCascadeBias: js.Array[Double] = ???
  var shadowCascadeWidth: js.Array[Double] = ???
  var shadowCascadeHeight: js.Array[Double] = ???
  var shadowCascadeNearZ: js.Array[Double] = ???
  var shadowCascadeFarZ: js.Array[Double] = ???
  var shadowCascadeArray: js.Array[DirectionalLight] = ???
  var shadowMap: RenderTarget = ???
  var shadowMapSize: Double = ???
  var shadowCamera: Camera = ???
  var shadowMatrix: Matrix4 = ???
  override def clone(): DirectionalLight = ???
}

@JSName("THREE.HemisphereLight")
class HemisphereLight  extends Light {
  def this(skyColorHex: Double = ???, groundColorHex: Double = ???, intensity: Double = ???) = this()
  var groundColor: Color = ???
  var intensity: Double = ???
  override def clone(): HemisphereLight = ???
}

@JSName("THREE.PointLight")
class PointLight  extends Light {
  def this(hex: Double = ???, intensity: Double = ???, distance: Double = ???) = this()
  var intensity: Double = ???
  var distance: Double = ???
  override def clone(): PointLight = ???
}

@JSName("THREE.SpotLight")
class SpotLight  extends Light {
  def this(hex: Double = ???, intensity: Double = ???, distance: Double = ???, angle: Double = ???, exponent: Double = ???) = this()
  var target: Object3D = ???
  var intensity: Double = ???
  var distance: Double = ???
  var angle: Double = ???
  var exponent: Double = ???

  var onlyShadow: Boolean = ???
  var shadowCameraNear: Double = ???
  var shadowCameraFar: Double = ???
  var shadowCameraFov: Double = ???
  var shadowCameraVisible: Boolean = ???
  var shadowBias: Double = ???
  var shadowDarkness: Double = ???
  var shadowMapWidth: Double = ???
  var shadowMapHeight: Double = ???
  var shadowMap: RenderTarget = ???
  var shadowMapSize: Vector2 = ???
  var shadowCamera: Camera = ???
  var shadowMatrix: Matrix4 = ???
  override def clone(): SpotLight = ???
}

trait Progress extends js.Object {
  var total: Double = ???
  var loaded: Double = ???
}

@JSName("THREE.Loader")
class Loader  extends js.Object {
  def this(showStatus: Boolean = ???) = this()
  var showStatus: Boolean = ???
  var statusDomElement: HTMLElement = ???
  var onLoadStart: js.Function0[Unit] = ???
  var onLoadProgress: js.Function0[Unit] = ???
  var onLoadComplete: js.Function0[Unit] = ???
  var crossOrigin: String = ???
  def addStatusElement(): HTMLElement = ???
  def updateProgress(progress: Progress): Unit = ???
  def extractUrlBase(url: String): String = ???
  def initMaterials(materials: js.Array[Material], texturePath: String): js.Array[Material] = ???
  def needsTangents(materials: js.Array[Material]): Boolean = ???
  def createMaterial(m: Material, texturePath: String): Boolean = ???
}

@JSName("THREE.Loader")
object Loader extends js.Object {
  var Handlers: LoaderHandler = ???
}

trait LoaderHandler extends js.Object {
  var handlers: js.Array[js.Any] = ???
  def add(regex: String, loader: Loader): Unit = ???
  def get(file: String): Loader = ???
}

@JSName("THREE.BufferGeometryLoader")
class BufferGeometryLoader  extends js.Object {
  def this(manager: LoadingManager = ???) = this()
  def load(url: String, onLoad: js.Function1[BufferGeometry, Unit], onProgress: js.Function1[js.Any, Unit] = ???, onError: js.Function1[js.Any, Unit] = ???): Unit = ???
  def setCrossOrigin(crossOrigin: String): Unit = ???
  def parse(json: js.Any): BufferGeometry = ???
}

@JSName("THREE.Cache")
class Cache extends js.Object {
  var files: js.Array[js.Any] = ???
  def add(key: String, file: js.Any): Unit = ???
  def get(key: String): js.Dynamic = ???
  def remove(key: String): Unit = ???
  def clear(): Unit = ???
}

@JSName("THREE.ImageLoader")
class ImageLoader  extends js.Object {
  def this(manager: LoadingManager = ???) = this()
  var crossOrigin: String = ???
  def load(url: String, onLoad: js.Function1[HTMLImageElement, Unit] = ???, onProgress: js.Function1[js.Any, Unit] = ???, onError: js.Function1[js.Any, Unit] = ???): HTMLImageElement = ???
  def setCrossOrigin(crossOrigin: String): Unit = ???
}

@JSName("THREE.JSONLoader")
class JSONLoader  extends Loader {
  def this(showStatus: Boolean = ???) = this()
  var withCredentials: Boolean = ???
  def load(url: String, callback: js.Function2[JSonLoaderResultGeometry, js.Array[Material], Unit], texturePath: String = ???): Unit = ???
  def loadAjaxJSON(context: JSONLoader, url: String, callback: js.Function2[Geometry, js.Array[Material], Unit], texturePath: String = ???, callbackProgress: js.Function1[Progress, Unit] = ???): Unit = ???
  def parse(json: String, texturePath: String): js.Dynamic = ???
}

trait JSonLoaderResultGeometry extends Geometry {
  var animation: AnimationData = ???
}

@JSName("THREE.LoadingManager")
class LoadingManager  extends js.Object {
  def this(onLoad: js.Function0[Unit] = ???, onProgress: js.Function3[String, Double, Double, Unit] = ???, onError: js.Function0[Unit] = ???) = this()
  var onLoad: js.Function0[Unit] = ???
  var onProgress: js.Function3[js.Any, Double, Double, Unit] = ???
  var onError: js.Function0[Unit] = ???
  def itemStart(url: String): Unit = ???
  def itemEnd(url: String): Unit = ???
}

@JSName("THREE.MaterialLoader")
class MaterialLoader  extends js.Object {
  def this(manager: LoadingManager = ???) = this()
  def load(url: String, onLoad: js.Function1[Material, Unit]): Unit = ???
  def setCrossOrigin(crossOrigin: String): Unit = ???
  def parse(json: js.Any): Material = ???
}

@JSName("THREE.ObjectLoader")
class ObjectLoader  extends js.Object {
  def this(manager: LoadingManager = ???) = this()
  def load(url: String, onLoad: js.Function1[Object3D, Unit]): Unit = ???
  def setCrossOrigin(crossOrigin: String): Unit = ???
  def parse[T <: Object3D](json: js.Any): T = ???
  def parseGeometries(json: js.Any): js.Array[js.Any] = ???
  def parseMaterials(json: js.Any): js.Array[Material] = ???
  def parseObject[T <: Object3D](data: js.Any, geometries: js.Array[js.Any], materials: js.Array[Material]): T = ???
}

@JSName("THREE.TextureLoader")
class TextureLoader  extends js.Object {
  def this(manager: LoadingManager = ???) = this()
  var crossOrigin: String = ???
  def load(url: String, onLoad: js.Function1[Texture, Unit]): Unit = ???
  def setCrossOrigin(crossOrigin: String): Unit = ???
}

@JSName("THREE.XHRLoader")
class XHRLoader  extends js.Object {
  def this(manager: LoadingManager = ???) = this()
  var responseType: String = ???
  var crossOrigin: String = ???
  def load(url: String, onLoad: js.Function1[String, Unit] = ???, onProgress: js.Function1[js.Any, Unit] = ???, onError: js.Function1[js.Any, Unit] = ???): Unit = ???
  def setResponseType(responseType: String): Unit = ???
  def setCrossOrigin(crossOrigin: String): Unit = ???
}

trait MaterialParameters extends js.Object {
  var name: String = ???
  var side: Side = ???
  var opacity: Double = ???
  var transparent: Boolean = ???
  var blending: Blending = ???
  var blendSrc: BlendingDstFactor = ???
  var blendDst: BlendingSrcFactor = ???
  var blendEquation: BlendingEquation = ???
  var depthTest: Boolean = ???
  var depthWrite: Boolean = ???
  var polygonOffset: Boolean = ???
  var polygonOffsetFactor: Double = ???
  var polygonOffsetUnits: Double = ???
  var alphaTest: Double = ???
  var overdraw: Double = ???
  var visible: Boolean = ???
  var needsUpdate: Boolean = ???
}

@JSName("THREE.Material")
class Material extends js.Object {
  var id: Double = ???
  var uuid: String = ???
  var name: String = ???
  var side: Side = ???
  var opacity: Double = ???
  var transparent: Boolean = ???
  var blending: Blending = ???
  var blendSrc: BlendingDstFactor = ???
  var blendDst: BlendingSrcFactor = ???
  var blendEquation: BlendingEquation = ???
  var depthTest: Boolean = ???
  var depthWrite: Boolean = ???
  var polygonOffset: Boolean = ???
  var polygonOffsetFactor: Double = ???
  var polygonOffsetUnits: Double = ???
  var alphaTest: Double = ???
  var overdraw: Double = ???
  var visible: Boolean = ???
  var needsUpdate: Boolean = ???
  def setValues(values: Object): Unit = ???
  def clone(material: Material): Material = ???
  def dispose(): Unit = ???
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

trait LineBasicMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var linewidth: Double = ???
  var linecap: String = ???
  var linejoin: String = ???
  var vertexColors: Colors = ???
  var fog: Boolean = ???
}

@JSName("THREE.LineBasicMaterial")
class LineBasicMaterial  extends Material {
  def this(parameters: LineBasicMaterialParameters = ???) = this()
  var color: Color = ???
  var linewidth: Double = ???
  var linecap: String = ???
  var linejoin: String = ???
  var vertexColors: Colors = ???
  var fog: Boolean = ???
  override def clone(): LineBasicMaterial = ???
}

trait LineDashedMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var linewidth: Double = ???
  var scale: Double = ???
  var dashSize: Double = ???
  var gapSize: Double = ???
  var vertexColors: Colors = ???
  var fog: Boolean = ???
}

@JSName("THREE.LineDashedMaterial")
class LineDashedMaterial  extends Material {
  def this(parameters: LineDashedMaterialParameters = ???) = this()
  var color: Color = ???
  var linewidth: Double = ???
  var scale: Double = ???
  var dashSize: Double = ???
  var gapSize: Double = ???
  var vertexColors: Colors = ???
  var fog: Boolean = ???
  override def clone(): LineDashedMaterial = ???
}

trait MeshBasicMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var map: Texture = ???
  var lightMap: Texture = ???
  var specularMap: Texture = ???
  var alphaMap: Texture = ???
  var envMap: Texture = ???
  var combine: Combine = ???
  var reflectivity: Double = ???
  var refractionRatio: Double = ???
  var fog: Boolean = ???
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var wireframeLinecap: String = ???
  var wireframeLinejoin: String = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
}

@JSName("THREE.MeshBasicMaterial")
class MeshBasicMaterial  extends Material {
  def this(parameters: MeshBasicMaterialParameters = ???) = this()
  var color: Color = ???
  var map: Texture = ???
  var lightMap: Texture = ???
  var specularMap: Texture = ???
  var alphaMap: Texture = ???
  var envMap: Texture = ???
  var combine: Combine = ???
  var reflectivity: Double = ???
  var refractionRatio: Double = ???
  var fog: Boolean = ???
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var wireframeLinecap: String = ???
  var wireframeLinejoin: String = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  override def clone(): MeshBasicMaterial = ???
}

trait MeshDepthMaterialParameters extends MaterialParameters {
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
}

@JSName("THREE.MeshDepthMaterial")
class MeshDepthMaterial  extends Material {
  def this(parameters: MeshDepthMaterialParameters = ???) = this()
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  override def clone(): MeshDepthMaterial = ???
}

@JSName("THREE.MeshFaceMaterial")
class MeshFaceMaterial  extends Material {
  def this(materials: js.Array[Material] = ???) = this()
  var materials: js.Array[Material] = ???
  override def clone(): MeshFaceMaterial = ???
}

trait MeshLambertMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var ambient: Double = ???
  var emissive: Double = ???
  var wrapAround: Boolean = ???
  var wrapRGB: Vector3 = ???
  var map: Texture = ???
  var lightMap: Texture = ???
  var specularMap: Texture = ???
  var alphaMap: Texture = ???
  var envMap: Texture = ???
  var combine: Combine = ???
  var reflectivity: Double = ???
  var refractionRatio: Double = ???
  var fog: Boolean = ???
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var wireframeLinecap: String = ???
  var wireframeLinejoin: String = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  var morphNormals: Boolean = ???
}

@JSName("THREE.MeshLambertMaterial")
class MeshLambertMaterial  extends Material {
  def this(parameters: MeshLambertMaterialParameters = ???) = this()
  var color: Color = ???
  var ambient: Color = ???
  var emissive: Color = ???
  var wrapAround: Boolean = ???
  var wrapRGB: Vector3 = ???
  var map: Texture = ???
  var lightMap: Texture = ???
  var specularMap: Texture = ???
  var alphaMap: Texture = ???
  var envMap: Texture = ???
  var combine: Combine = ???
  var reflectivity: Double = ???
  var refractionRatio: Double = ???
  var fog: Boolean = ???
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var wireframeLinecap: String = ???
  var wireframeLinejoin: String = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  var morphNormals: Boolean = ???
  override def clone(): MeshLambertMaterial = ???
}

trait MeshNormalMaterialParameters extends MaterialParameters {
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var morphTargets: Boolean = ???
}

@JSName("THREE.MeshNormalMaterial")
class MeshNormalMaterial  extends Material {
  def this(parameters: MeshNormalMaterialParameters = ???) = this()
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var morphTargets: Boolean = ???
  override def clone(): MeshNormalMaterial = ???
}

trait MeshPhongMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var ambient: Double = ???
  var emissive: Double = ???
  var specular: Double = ???
  var shininess: Double = ???
  var metal: Boolean = ???
  var wrapAround: Boolean = ???
  var wrapRGB: Vector3 = ???
  var map: Texture = ???
  var lightMap: Texture = ???
  var bumpMap: Texture = ???
  var bumpScale: Double = ???
  var normalMap: Texture = ???
  var normalScale: Vector2 = ???
  var specularMap: Texture = ???
  var alphaMap: Texture = ???
  var envMap: Texture = ???
  var combine: Combine = ???
  var reflectivity: Double = ???
  var refractionRatio: Double = ???
  var fog: Boolean = ???
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var wireframeLinecap: String = ???
  var wireframeLinejoin: String = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  var morphNormals: Boolean = ???
}

@JSName("THREE.MeshPhongMaterial")
class MeshPhongMaterial  extends Material {
  def this(parameters: MeshPhongMaterialParameters = ???) = this()
  var color: Color = ???
  var ambient: Color = ???
  var emissive: Color = ???
  var specular: Color = ???
  var shininess: Double = ???
  var metal: Boolean = ???
  var wrapAround: Boolean = ???
  var wrapRGB: Vector3 = ???
  var map: Texture = ???
  var lightMap: Texture = ???
  var bumpMap: Texture = ???
  var bumpScale: Double = ???
  var normalMap: Texture = ???
  var normalScale: Vector2 = ???
  var specularMap: Texture = ???
  var alphaMap: Texture = ???
  var envMap: Texture = ???
  var combine: Combine = ???
  var reflectivity: Double = ???
  var refractionRatio: Double = ???
  var fog: Boolean = ???
  var shading: Shading = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var wireframeLinecap: String = ???
  var wireframeLinejoin: String = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  var morphNormals: Boolean = ???
  override def clone(): MeshPhongMaterial = ???
}

trait PointCloudMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var map: Texture = ???
  var size: Double = ???
  var sizeAttenuation: Boolean = ???
  var vertexColors: Colors = ???
  var fog: Boolean = ???
}

@JSName("THREE.PointCloudMaterial")
class PointCloudMaterial  extends Material {
  def this(parameters: PointCloudMaterialParameters = ???) = this()
  var color: Color = ???
  var map: Texture = ???
  var size: Double = ???
  var sizeAttenuation: Boolean = ???
  var vertexColors: Boolean = ???
  var fog: Boolean = ???
  override  def clone(): PointCloudMaterial = ???
}

@JSName("THREE.ParticleBasicMaterial")
class ParticleBasicMaterial extends PointCloudMaterial {
}

@JSName("THREE.ParticleSystemMaterial")
class ParticleSystemMaterial extends PointCloudMaterial {
}

@JSName("THREE.RawShaderMaterial")
class RawShaderMaterial  extends ShaderMaterial {
  def this(parameters: ShaderMaterialParameters = ???) = this()
}

trait ShaderMaterialParameters extends MaterialParameters {
  var defines: js.Any = ???
  var uniforms: js.Any = ???
  var attributes: js.Any = ???
  var vertexShader: String = ???
  var fragmentShader: String = ???
  var shading: Shading = ???
  var linewidth: Double = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var fog: Boolean = ???
  var lights: Boolean = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  var morphNormals: Boolean = ???
}

@JSName("THREE.ShaderMaterial")
class ShaderMaterial  extends Material {
  def this(parameters: ShaderMaterialParameters = ???) = this()
  var defines: js.Any = ???
  var uniforms: js.Any = ???
  var attributes: js.Any = ???
  var vertexShader: String = ???
  var fragmentShader: String = ???
  var shading: Shading = ???
  var linewidth: Double = ???
  var wireframe: Boolean = ???
  var wireframeLinewidth: Double = ???
  var fog: Boolean = ???
  var lights: Boolean = ???
  var vertexColors: Colors = ???
  var skinning: Boolean = ???
  var morphTargets: Boolean = ???
  var morphNormals: Boolean = ???
  override def clone(): ShaderMaterial = ???
}

trait SpriteCanvasMaterialParameters extends MaterialParameters {
  var color: Double = ???
}

@JSName("THREE.SpriteCanvasMaterial")
class SpriteCanvasMaterial  extends Material {
  def this(parameters: SpriteCanvasMaterialParameters = ???) = this()
  var color: Color = ???
  def program(context: js.Any, color: Color): Unit = ???
  override def clone(): SpriteCanvasMaterial = ???
}

trait SpriteMaterialParameters extends MaterialParameters {
  var color: Double = ???
  var map: Texture = ???
  var rotation: Double = ???
  var fog: Boolean = ???
}

@JSName("THREE.SpriteMaterial")
class SpriteMaterial  extends Material {
  def this(parameters: SpriteMaterialParameters = ???) = this()
  var color: Color = ???
  var map: Texture = ???
  var rotation: Double = ???
  var fog: Boolean = ???
  override def clone(): SpriteMaterial = ???
}

@JSName("THREE.Box2")
class Box2  extends js.Object {
  def this(min: Vector2 = ???, max: Vector2 = ???) = this()
  var max: Vector2 = ???
  var min: Vector2 = ???
  def set(min: Vector2, max: Vector2): Box2 = ???
  def setFromPoints(points: js.Array[Vector2]): Box2 = ???
  def setFromCenterAndSize(center: Vector2, size: Double): Box2 = ???
  def copy(box: Box2): Box2 = ???
  def makeEmpty(): Box2 = ???
  def empty(): Boolean = ???
  def center(optionalTarget: Vector2 = ???): Vector2 = ???
  def size(optionalTarget: Vector2 = ???): Vector2 = ???
  def expandByPoint(point: Vector2): Box2 = ???
  def expandByVector(vector: Vector2): Box2 = ???
  def expandByScalar(scalar: Double): Box2 = ???
  def containsPoint(point: Vector2): Boolean = ???
  def containsBox(box: Box2): Boolean = ???
  def getParameter(point: Vector2): Vector2 = ???
  def isIntersectionBox(box: Box2): Boolean = ???
  def clampPoint(point: Vector2, optionalTarget: Vector2 = ???): Vector2 = ???
  def distanceToPoint(point: Vector2): Double = ???
  def intersect(box: Box2): Box2 = ???
  def union(box: Box2): Box2 = ???
  def translate(offset: Vector2): Box2 = ???
  def equals(box: Box2): Boolean = ???
  override def clone(): Box2 = ???
}

@JSName("THREE.Box3")
class Box3  extends js.Object {
  def this(min: Vector3 = ???, max: Vector3 = ???) = this()
  var max: Vector3 = ???
  var min: Vector3 = ???
  def set(min: Vector3, max: Vector3): Box3 = ???
  def setFromPoints(points: js.Array[Vector3]): Box3 = ???
  def setFromCenterAndSize(center: Vector3, size: Double): Box3 = ???
  def setFromObject(`object`: Object3D): Box3 = ???
  def copy(box: Box3): Box3 = ???
  def makeEmpty(): Box3 = ???
  def empty(): Boolean = ???
  def center(optionalTarget: Vector3 = ???): Vector3 = ???
  def size(optionalTarget: Vector3 = ???): Vector3 = ???
  def expandByPoint(point: Vector3): Box3 = ???
  def expandByVector(vector: Vector3): Box3 = ???
  def expandByScalar(scalar: Double): Box3 = ???
  def containsPoint(point: Vector3): Boolean = ???
  def containsBox(box: Box3): Boolean = ???
  def getParameter(point: Vector3): Vector3 = ???
  def isIntersectionBox(box: Box3): Boolean = ???
  def clampPoint(point: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def distanceToPoint(point: Vector3): Double = ???
  def getBoundingSphere(): Sphere = ???
  def intersect(box: Box3): Box3 = ???
  def union(box: Box3): Box3 = ???
  def applyMatrix4(matrix: Matrix4): Box3 = ???
  def translate(offset: Vector3): Box3 = ???
  def equals(box: Box3): Boolean = ???
  override def clone(): Box3 = ???
}

trait HSL extends js.Object {
  var h: Double = ???
  var s: Double = ???
  var l: Double = ???
}

@JSName("THREE.Color")
class Color  extends js.Object {
  def this(color: Color = ???) = this()
  def this(r: Double, g: Double, b: Double) = this()
  var r: Double = ???
  var g: Double = ???
  var b: Double = ???
  def set(color: Color): Color = ???
  def setHex(hex: Double): Color = ???
  def setRGB(r: Double, g: Double, b: Double): Color = ???
  def setHSL(h: Double, s: Double, l: Double): Color = ???
  def setStyle(style: String): Color = ???
  def copy(color: Color): Color = ???
  def copyGammaToLinear(color: Color): Color = ???
  def copyLinearToGamma(color: Color): Color = ???
  def convertGammaToLinear(): Color = ???
  def convertLinearToGamma(): Color = ???
  def getHex(): Double = ???
  def getHexString(): String = ???
  def getHSL(): HSL = ???
  def getStyle(): String = ???
  def offsetHSL(h: Double, s: Double, l: Double): Color = ???
  def add(color: Color): Color = ???
  def addColors(color1: Color, color2: Color): Color = ???
  def addScalar(s: Double): Color = ???
  def multiply(color: Color): Color = ???
  def multiplyScalar(s: Double): Color = ???
  def lerp(color: Color, alpha: Double): Color = ???
  def equals(color: Color): Boolean = ???
  def fromArray(rgb: js.Array[Double]): Color = ???
  def toArray(): js.Array[Double] = ???
  override def clone(): Color = ???
}

@JSName("THREE.ColorKeywords")
class ColorKeywords extends js.Object {
}

@JSName("THREE.ColorKeywords")
object ColorKeywords extends js.Object {
  var aliceblue: Double = ???
  var antiquewhite: Double = ???
  var aqua: Double = ???
  var aquamarine: Double = ???
  var azure: Double = ???
  var beige: Double = ???
  var bisque: Double = ???
  var black: Double = ???
  var blanchedalmond: Double = ???
  var blue: Double = ???
  var blueviolet: Double = ???
  var brown: Double = ???
  var burlywood: Double = ???
  var cadetblue: Double = ???
  var chartreuse: Double = ???
  var chocolate: Double = ???
  var coral: Double = ???
  var cornflowerblue: Double = ???
  var cornsilk: Double = ???
  var crimson: Double = ???
  var cyan: Double = ???
  var darkblue: Double = ???
  var darkcyan: Double = ???
  var darkgoldenrod: Double = ???
  var darkgray: Double = ???
  var darkgreen: Double = ???
  var darkgrey: Double = ???
  var darkkhaki: Double = ???
  var darkmagenta: Double = ???
  var darkolivegreen: Double = ???
  var darkorange: Double = ???
  var darkorchid: Double = ???
  var darkred: Double = ???
  var darksalmon: Double = ???
  var darkseagreen: Double = ???
  var darkslateblue: Double = ???
  var darkslategray: Double = ???
  var darkslategrey: Double = ???
  var darkturquoise: Double = ???
  var darkviolet: Double = ???
  var deeppink: Double = ???
  var deepskyblue: Double = ???
  var dimgray: Double = ???
  var dimgrey: Double = ???
  var dodgerblue: Double = ???
  var firebrick: Double = ???
  var floralwhite: Double = ???
  var forestgreen: Double = ???
  var fuchsia: Double = ???
  var gainsboro: Double = ???
  var ghostwhite: Double = ???
  var gold: Double = ???
  var goldenrod: Double = ???
  var gray: Double = ???
  var green: Double = ???
  var greenyellow: Double = ???
  var grey: Double = ???
  var honeydew: Double = ???
  var hotpink: Double = ???
  var indianred: Double = ???
  var indigo: Double = ???
  var ivory: Double = ???
  var khaki: Double = ???
  var lavender: Double = ???
  var lavenderblush: Double = ???
  var lawngreen: Double = ???
  var lemonchiffon: Double = ???
  var lightblue: Double = ???
  var lightcoral: Double = ???
  var lightcyan: Double = ???
  var lightgoldenrodyellow: Double = ???
  var lightgray: Double = ???
  var lightgreen: Double = ???
  var lightgrey: Double = ???
  var lightpink: Double = ???
  var lightsalmon: Double = ???
  var lightseagreen: Double = ???
  var lightskyblue: Double = ???
  var lightslategray: Double = ???
  var lightslategrey: Double = ???
  var lightsteelblue: Double = ???
  var lightyellow: Double = ???
  var lime: Double = ???
  var limegreen: Double = ???
  var linen: Double = ???
  var magenta: Double = ???
  var maroon: Double = ???
  var mediumaquamarine: Double = ???
  var mediumblue: Double = ???
  var mediumorchid: Double = ???
  var mediumpurple: Double = ???
  var mediumseagreen: Double = ???
  var mediumslateblue: Double = ???
  var mediumspringgreen: Double = ???
  var mediumturquoise: Double = ???
  var mediumvioletred: Double = ???
  var midnightblue: Double = ???
  var mintcream: Double = ???
  var mistyrose: Double = ???
  var moccasin: Double = ???
  var navajowhite: Double = ???
  var navy: Double = ???
  var oldlace: Double = ???
  var olive: Double = ???
  var olivedrab: Double = ???
  var orange: Double = ???
  var orangered: Double = ???
  var orchid: Double = ???
  var palegoldenrod: Double = ???
  var palegreen: Double = ???
  var paleturquoise: Double = ???
  var palevioletred: Double = ???
  var papayawhip: Double = ???
  var peachpuff: Double = ???
  var peru: Double = ???
  var pink: Double = ???
  var plum: Double = ???
  var powderblue: Double = ???
  var purple: Double = ???
  var red: Double = ???
  var rosybrown: Double = ???
  var royalblue: Double = ???
  var saddlebrown: Double = ???
  var salmon: Double = ???
  var sandybrown: Double = ???
  var seagreen: Double = ???
  var seashell: Double = ???
  var sienna: Double = ???
  var silver: Double = ???
  var skyblue: Double = ???
  var slateblue: Double = ???
  var slategray: Double = ???
  var slategrey: Double = ???
  var snow: Double = ???
  var springgreen: Double = ???
  var steelblue: Double = ???
  var tan: Double = ???
  var teal: Double = ???
  var thistle: Double = ???
  var tomato: Double = ???
  var turquoise: Double = ???
  var violet: Double = ???
  var wheat: Double = ???
  var white: Double = ???
  var whitesmoke: Double = ???
  var yellow: Double = ???
  var yellowgreen: Double = ???
}

@JSName("THREE.Euler")
class Euler  extends js.Object {
  def this(x: Double = ???, y: Double = ???, z: Double = ???, order: String = ???) = this()
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
  var order: String = ???
  def set(x: Double, y: Double, z: Double, order: String = ???): Euler = ???
  def copy(euler: Euler): Euler = ???
  def setFromRotationMatrix(m: Matrix4, order: String = ???): Euler = ???
  def setFromQuaternion(q: Quaternion, order: String = ???, update: Boolean = ???): Euler = ???
  def reorder(newOrder: String): Euler = ???
  def equals(euler: Euler): Boolean = ???
  def fromArray(xyzo: js.Array[js.Any]): Euler = ???
  def toArray(): js.Array[js.Any] = ???
  var onChange: js.Function0[Unit] = ???
  override def clone(): Euler = ???
}

@JSName("THREE.Frustum")
class Frustum  extends js.Object {
  def this(p0: Plane = ???, p1: Plane = ???, p2: Plane = ???, p3: Plane = ???, p4: Plane = ???, p5: Plane = ???) = this()
  var planes: js.Array[Plane] = ???
  def set(p0: Double = ???, p1: Double = ???, p2: Double = ???, p3: Double = ???, p4: Double = ???, p5: Double = ???): Frustum = ???
  def copy(frustum: Frustum): Frustum = ???
  def setFromMatrix(m: Matrix4): Frustum = ???
  def intersectsObject(`object`: Object3D): Boolean = ???
  def intersectsSphere(sphere: Sphere): Boolean = ???
  def intersectsBox(box: Box3): Boolean = ???
  def containsPoint(point: Vector3): Boolean = ???
  override def clone(): Frustum = ???
}

@JSName("THREE.Line3")
class Line3  extends js.Object {
  def this(start: Vector3 = ???, end: Vector3 = ???) = this()
  var start: Vector3 = ???
  var end: Vector3 = ???
  def set(start: Vector3 = ???, end: Vector3 = ???): Line3 = ???
  def copy(line: Line3): Line3 = ???
  def center(optionalTarget: Vector3 = ???): Vector3 = ???
  def delta(optionalTarget: Vector3 = ???): Vector3 = ???
  def distanceSq(): Double = ???
  def distance(): Double = ???
  def at(t: Double, optionalTarget: Vector3 = ???): Vector3 = ???
  def closestPointToPointParameter(point: Vector3, clampToLine: Boolean = ???): Double = ???
  def closestPointToPoint(point: Vector3, clampToLine: Boolean = ???, optionalTarget: Vector3 = ???): Vector3 = ???
  def applyMatrix4(matrix: Matrix4): Line3 = ???
  def equals(line: Line3): Boolean = ???
  override def clone(): Line3 = ???
}

trait Math extends js.Object {
  def generateUUID(): String = ???
  def clamp(x: Double, a: Double, b: Double): Double = ???
  def clampBottom(x: Double, a: Double): Double = ???
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = ???
  def smoothstep(x: Double, min: Double, max: Double): Double = ???
  def smootherstep(x: Double, min: Double, max: Double): Double = ???
  def random16(): Double = ???
  def randInt(low: Double, high: Double): Double = ???
  def randFloat(low: Double, high: Double): Double = ???
  def randFloatSpread(range: Double): Double = ???
  def sign(x: Double): Double = ???
  def degToRad(degrees: Double): Double = ???
  def radToDeg(radians: Double): Double = ???
  def isPowerOfTwo(value: Double): Boolean = ???
}

trait Matrix extends js.Object {
  var elements: Float32Array = ???
  def identity(): Matrix = ???
  def copy(m: Matrix): Matrix = ???
  def multiplyScalar(s: Double): Matrix = ???
  def determinant(): Double = ???
  def getInverse(matrix: Matrix, throwOnInvertible: Boolean = ???): Matrix = ???
  def transpose(): Matrix = ???
  override def clone(): Matrix = ???
}

@JSName("THREE.Matrix3")
class Matrix3 extends Matrix {
  def this(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double) = this()

  def set(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double): Matrix3 = ???
  override def identity(): Matrix3 = ???
  def copy(m: Matrix3): Matrix3 = ???
  def applyToVector3Array(array: js.Array[Double], offset: Double = ???, length: Double = ???): js.Array[Double] = ???
  override def multiplyScalar(s: Double): Matrix3 = ???
  override def determinant(): Double = ???
  def getInverse(matrix: Matrix3): Matrix3 = ???
  def getInverse(matrix: Matrix3, throwOnInvertible: Boolean): Matrix3 = ???
  override def transpose(): Matrix3 = ???
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = ???
  def getNormalMatrix(m: Matrix4): Matrix3 = ???
  def transposeIntoArray(r: js.Array[Double]): js.Array[Double] = ???
  def fromArray(array: js.Array[Double]): Matrix3 = ???
  def toArray(): js.Array[Double] = ???
  override def clone(): Matrix3 = ???
}

@JSName("THREE.Matrix4")
class Matrix4  extends Matrix {
  def this(n11: Double = ???, n12: Double = ???, n13: Double = ???, n14: Double = ???, n21: Double = ???, n22: Double = ???, n23: Double = ???, n24: Double = ???, n31: Double = ???, n32: Double = ???, n33: Double = ???, n34: Double = ???, n41: Double = ???, n42: Double = ???, n43: Double = ???, n44: Double = ???) = this()

  def set(n11: Double, n12: Double, n13: Double, n14: Double, n21: Double, n22: Double, n23: Double, n24: Double, n31: Double, n32: Double, n33: Double, n34: Double, n41: Double, n42: Double, n43: Double, n44: Double): Matrix4 = ???
  override def identity(): Matrix4 = ???
  def copy(m: Matrix4): Matrix4 = ???
  def copyPosition(m: Matrix4): Matrix4 = ???
  def extractRotation(m: Matrix4): Matrix4 = ???
  def makeRotationFromEuler(euler: Euler): Matrix4 = ???
  def makeRotationFromQuaternion(q: Quaternion): Matrix4 = ???
  def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = ???
  def multiply(m: Matrix4): Matrix4 = ???
  def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = ???
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = ???
  override def multiplyScalar(s: Double): Matrix4 = ???
  def applyToVector3Array(array: js.Array[Double], offset: Double = ???, length: Double = ???): js.Array[Double] = ???
  override def determinant(): Double = ???
  override def transpose(): Matrix4 = ???
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = ???
  def setPosition(v: Vector3): Vector3 = ???
  def getInverse(m: Matrix4): Matrix4 = ???
  def getInverse(m: Matrix4, throwOnInvertible: Boolean): Matrix4 = ???
  def scale(v: Vector3): Matrix4 = ???
  def getMaxScaleOnAxis(): Double = ???
  def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = ???
  def makeRotationX(theta: Double): Matrix4 = ???
  def makeRotationY(theta: Double): Matrix4 = ???
  def makeRotationZ(theta: Double): Matrix4 = ???
  def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = ???
  def makeScale(x: Double, y: Double, z: Double): Matrix4 = ???
  def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = ???
  def decompose(translation: Vector3 = ???, rotation: Quaternion = ???, scale: Vector3 = ???): js.Array[Object] = ???
  def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = ???
  def makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = ???
  def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 = ???
  def fromArray(array: js.Array[Double]): Matrix4 = ???
  def toArray(): js.Array[Double] = ???
  override def clone(): Matrix4 = ???
}

@JSName("THREE.Plane")
class Plane  extends js.Object {
  def this(normal: Vector3 = ???, constant: Double = ???) = this()
  var normal: Vector3 = ???
  var constant: Double = ???
  def set(normal: Vector3, constant: Double): Plane = ???
  def setComponents(x: Double, y: Double, z: Double, w: Double): Plane = ???
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = ???
  def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = ???
  def copy(plane: Plane): Plane = ???
  def normalize(): Plane = ???
  def negate(): Plane = ???
  def distanceToPoint(point: Vector3): Double = ???
  def distanceToSphere(sphere: Sphere): Double = ???
  def projectPoint(point: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def orthoPoint(point: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def isIntersectionLine(line: Line3): Boolean = ???
  def intersectLine(line: Line3, optionalTarget: Vector3 = ???): Vector3 = ???
  def coplanarPoint(optionalTarget: Boolean = ???): Vector3 = ???
  def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3 = ???): Plane = ???
  def translate(offset: Vector3): Plane = ???
  def equals(plane: Plane): Boolean = ???
  override def clone(): Plane = ???
}

@JSName("THREE.Quaternion")
class Quaternion  extends js.Object {
  def this(x: Double = ???, y: Double = ???, z: Double = ???, w: Double = ???) = this()
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
  var w: Double = ???
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = ???
  def copy(q: Quaternion): Quaternion = ???
  def setFromEuler(euler: Euler, update: Boolean = ???): Quaternion = ???
  def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = ???
  def setFromRotationMatrix(m: Matrix4): Quaternion = ???
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector4): Quaternion = ???
  def inverse(): Quaternion = ???
  def conjugate(): Quaternion = ???
  def dot(v: Vector3): Double = ???
  def lengthSq(): Double = ???
  def length(): Double = ???
  def normalize(): Quaternion = ???
  def multiply(q: Quaternion): Quaternion = ???
  def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = ???
  def multiplyVector3(vector: Vector3): Vector3 = ???
  def slerp(qb: Quaternion, t: Double): Quaternion = ???
  def equals(v: Quaternion): Boolean = ???
  def fromArray(n: js.Array[Double]): Quaternion = ???
  def toArray(): js.Array[Double] = ???
  var onChange: js.Function0[Unit] = ???
  override def clone(): Quaternion = ???
}

@JSName("THREE.Quaternion")
object Quaternion extends js.Object {
  def slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Double): Quaternion = ???
}

@JSName("THREE.Ray")
class Ray  extends js.Object {
  def this(origin: Vector3 = ???, direction: Vector3 = ???) = this()
  var origin: Vector3 = ???
  var direction: Vector3 = ???
  def set(origin: Vector3, direction: Vector3): Ray = ???
  def copy(ray: Ray): Ray = ???
  def at(t: Double, optionalTarget: Vector3 = ???): Vector3 = ???
  def recast(t: Double): Ray = ???
  def closestPointToPoint(point: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def distanceToPoint(point: Vector3): Double = ???
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3 = ???, optionalPointOnSegment: Vector3 = ???): Double = ???
  def isIntersectionSphere(sphere: Sphere): Boolean = ???
  def intersectSphere(sphere: Sphere, optionalTarget: Vector3 = ???): Vector3 = ???
  def isIntersectionPlane(plane: Plane): Boolean = ???
  def distanceToPlane(plane: Plane): Double = ???
  def intersectPlane(plane: Plane, optionalTarget: Vector3 = ???): Vector3 = ???
  def isIntersectionBox(box: Box3): Boolean = ???
  def intersectBox(box: Box3, optionalTarget: Vector3 = ???): Vector3 = ???
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, optionalTarget: Vector3 = ???): Vector3 = ???
  def applyMatrix4(matrix4: Matrix4): Ray = ???
  def equals(ray: Ray): Boolean = ???
  override def clone(): Ray = ???
}

@JSName("THREE.Sphere")
class Sphere  extends js.Object {
  def this(center: Vector3 = ???, radius: Double = ???) = this()
  var center: Vector3 = ???
  var radius: Double = ???
  def set(center: Vector3, radius: Double): Sphere = ???
  def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3 = ???): Sphere = ???
  def copy(sphere: Sphere): Sphere = ???
  def empty(): Boolean = ???
  def containsPoint(point: Vector3): Boolean = ???
  def distanceToPoint(point: Vector3): Double = ???
  def intersectsSphere(sphere: Sphere): Boolean = ???
  def clampPoint(point: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def getBoundingBox(optionalTarget: Box3 = ???): Box3 = ???
  def applyMatrix4(matrix: Matrix4): Sphere = ???
  def translate(offset: Vector3): Sphere = ???
  def equals(sphere: Sphere): Boolean = ???
  override def clone(): Sphere = ???
}

trait SplineControlPoint extends js.Object {
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
}

@JSName("THREE.Spline")
class Spline  extends js.Object {
  def this(points: js.Array[SplineControlPoint]) = this()
  var points: js.Array[SplineControlPoint] = ???
  def initFromArray(a: js.Array[js.Array[Double]]): Unit = ???
  def getPoint(k: Double): SplineControlPoint = ???
  def getControlPointsArray(): js.Array[js.Array[Double]] = ???
  def getLength(nSubDivisions: Double = ???): js.Any = ???
  def reparametrizeByArcLength(samplingCoef: Double): Unit = ???
}

@JSName("THREE.Triangle")
class Triangle  extends js.Object {
  def this(a: Vector3 = ???, b: Vector3 = ???, c: Vector3 = ???) = this()
  var a: Vector3 = ???
  var b: Vector3 = ???
  var c: Vector3 = ???
  def set(a: Vector3, b: Vector3, c: Vector3): Triangle = ???
  def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): Triangle = ???
  def copy(triangle: Triangle): Triangle = ???
  def area(): Double = ???
  def midpoint(optionalTarget: Vector3 = ???): Vector3 = ???
  def normal(optionalTarget: Vector3 = ???): Vector3 = ???
  def plane(optionalTarget: Vector3 = ???): Plane = ???
  def barycoordFromPoint(point: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def containsPoint(point: Vector3): Boolean = ???
  def equals(triangle: Triangle): Boolean = ???
  override def clone(): Triangle = ???
}

@JSName("THREE.Triangle")
object Triangle extends js.Object {
  def normal(a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3 = ???): Vector3 = ???
  def barycoordFromPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3): Vector3 = ???
  def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean = ???
}

trait Vector extends js.Object {
  def setComponent(index: Double, value: Double): Unit = ???
  def getComponent(index: Double): Double = ???
  def copy(v: Vector): Vector = ???
  def add(v: Vector): Vector = ???
  def addVectors(a: Vector, b: Vector): Vector = ???
  def sub(v: Vector): Vector = ???
  def subVectors(a: Vector, b: Vector): Vector = ???
  def multiplyScalar(s: Double): Vector = ???
  def divideScalar(s: Double): Vector = ???
  def negate(): Vector = ???
  def dot(v: Vector): Double = ???
  def lengthSq(): Double = ???
  def length(): Double = ???
  def normalize(): Vector = ???
  def distanceTo(v: Vector): Double = ???
  def distanceToSquared(v: Vector): Double = ???
  def setLength(l: Double): Vector = ???
  def lerp(v: Vector, alpha: Double): Vector = ???
  def equals(v: Vector): Boolean = ???
  override def clone(): Vector = ???
}

@JSName("THREE.Vector2")
class Vector2  extends Vector {
  def this(x: Double = ???, y: Double = ???) = this()
  var x: Double = ???
  var y: Double = ???
  def set(x: Double, y: Double): Vector2 = ???
  def setX(x: Double): Vector2 = ???
  def setY(y: Double): Vector2 = ???
  override def setComponent(index: Double, value: Double): Unit = ???
  override def getComponent(index: Double): Double = ???
  def copy(v: Vector2): Vector2 = ???
  def add(v: Vector2): Vector2 = ???
  def addVectors(a: Vector2, b: Vector2): Vector2 = ???
  def addScalar(s: Double): Vector2 = ???
  def sub(v: Vector2): Vector2 = ???
  def subVectors(a: Vector2, b: Vector2): Vector2 = ???
  def multiply(v: Vector2): Vector2 = ???
  override def multiplyScalar(s: Double): Vector2 = ???
  def divide(v: Vector2): Vector2 = ???
  override def divideScalar(s: Double): Vector2 = ???
  def min(v: Vector2): Vector2 = ???
  def max(v: Vector2): Vector2 = ???
  def clamp(min: Vector2, max: Vector2): Vector2 = ???
  def clampScalar(min: Double, max: Double): Vector2 = ???
  def floor(): Vector2 = ???
  def ceil(): Vector2 = ???
  def round(): Vector2 = ???
  def roundToZero(): Vector2 = ???
  override def negate(): Vector2 = ???
  def dot(v: Vector2): Double = ???
  override def lengthSq(): Double = ???
  override def length(): Double = ???
  override  def normalize(): Vector2 = ???
  def distanceTo(v: Vector2): Double = ???
  def distanceToSquared(v: Vector2): Double = ???
  override def setLength(l: Double): Vector2 = ???
  def lerp(v: Vector2, alpha: Double): Vector2 = ???
  def equals(v: Vector2): Boolean = ???
  def fromArray(xy: js.Array[Double]): Vector2 = ???
  def toArray(): js.Array[Double] = ???
  override  def clone(): Vector2 = ???
}

@JSName("THREE.Vector3")
class Vector3  extends Vector {
  def this(x: Double = ???, y: Double = ???, z: Double = ???) = this()
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
  def set(x: Double, y: Double, z: Double): Vector3 = ???
  def setX(x: Double): Vector3 = ???
  def setY(y: Double): Vector3 = ???
  def setZ(z: Double): Vector3 = ???
  override def setComponent(index: Double, value: Double): Unit = ???
  override def getComponent(index: Double): Double = ???
  def copy(v: Vector3): Vector3 = ???
  def add(a: Object): Vector3 = ???
  def addScalar(s: Double): Vector3 = ???
  def addVectors(a: Vector3, b: Vector3): Vector3 = ???
  def sub(a: Vector3): Vector3 = ???
  def subVectors(a: Vector3, b: Vector3): Vector3 = ???
  def multiply(v: Vector3): Vector3 = ???
  override def multiplyScalar(s: Double): Vector3 = ???
  def multiplyVectors(a: Vector3, b: Vector3): Vector3 = ???
  def applyEuler(euler: Euler): Vector3 = ???
  def applyAxisAngle(axis: Vector3, angle: Double): Vector3 = ???
  def applyMatrix3(m: Matrix3): Vector3 = ???
  def applyMatrix4(m: Matrix4): Vector3 = ???
  def applyProjection(m: Matrix4): Vector3 = ???
  def applyQuaternion(q: Quaternion): Vector3 = ???
  def transformDirection(m: Matrix4): Vector3 = ???
  def divide(v: Vector3): Vector3 = ???
  override def divideScalar(s: Double): Vector3 = ???
  def min(v: Vector3): Vector3 = ???
  def max(v: Vector3): Vector3 = ???
  def clamp(min: Vector3, max: Vector3): Vector3 = ???
  def clampScalar(min: Double, max: Double): Vector3 = ???
  def floor(): Vector3 = ???
  def ceil(): Vector3 = ???
  def round(): Vector3 = ???
  def roundToZero(): Vector3 = ???
  override def negate(): Vector3 = ???
  def dot(v: Vector3): Double = ???
  override def lengthSq(): Double = ???
  override def length(): Double = ???
  def lengthManhattan(): Double = ???
  override def normalize(): Vector3 = ???
  override def setLength(l: Double): Vector3 = ???
  def lerp(v: Vector3, alpha: Double): Vector3 = ???
  def cross(a: Vector3): Vector3 = ???
  def crossVectors(a: Vector3, b: Vector3): Vector3 = ???
  def projectOnVector(v: Vector3): Vector3 = ???
  def projectOnPlane(planeNormal: Vector3): Vector3 = ???
  def reflect(vector: Vector3): Vector3 = ???
  def angleTo(v: Vector3): Double = ???
  def distanceTo(v: Vector3): Double = ???
  def distanceToSquared(v: Vector3): Double = ???
  def setFromMatrixPosition(m: Matrix4): Vector3 = ???
  def setFromMatrixScale(m: Matrix4): Vector3 = ???
  def setFromMatrixColumn(index: Double, matrix: Matrix4): Vector3 = ???
  def equals(v: Vector3): Boolean = ???
  def fromArray(xyz: js.Array[Double]): Vector3 = ???
  def toArray(): js.Array[Double] = ???
  override def clone(): Vector3 = ???
}

@JSName("THREE.Vector4")
class Vector4  extends Vector {
  def this(x: Double = ???, y: Double = ???, z: Double = ???, w: Double = ???) = this()
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
  var w: Double = ???
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = ???
  def setX(x: Double): Vector4 = ???
  def setY(y: Double): Vector4 = ???
  def setZ(z: Double): Vector4 = ???
  def setW(w: Double): Vector4 = ???
  override def setComponent(index: Double, value: Double): Unit = ???
  override def getComponent(index: Double): Double = ???
  def copy(v: Vector4): Vector4 = ???
  def add(v: Vector4): Vector4 = ???
  def addScalar(s: Double): Vector4 = ???
  def addVectors(a: Vector4, b: Vector4): Vector4 = ???
  def sub(v: Vector4): Vector4 = ???
  def subVectors(a: Vector4, b: Vector4): Vector4 = ???
  override def multiplyScalar(s: Double): Vector4 = ???
  def applyMatrix4(m: Matrix4): Vector4 = ???
  override def divideScalar(s: Double): Vector4 = ???
  def setAxisAngleFromQuaternion(q: Quaternion): Vector4 = ???
  def setAxisAngleFromRotationMatrix(m: Matrix3): Vector4 = ???
  def min(v: Vector4): Vector4 = ???
  def max(v: Vector4): Vector4 = ???
  def clamp(min: Vector4, max: Vector4): Vector4 = ???
  def clampScalar(min: Double, max: Double): Vector4 = ???
  def floor(): Vector4 = ???
  def ceil(): Vector4 = ???
  def round(): Vector4 = ???
  def roundToZero(): Vector4 = ???
  override def negate(): Vector4 = ???
  def dot(v: Vector4): Double = ???
  override def lengthSq(): Double = ???
  override def length(): Double = ???
  def lengthManhattan(): Double = ???
  override def normalize(): Vector4 = ???
  override def setLength(l: Double): Vector4 = ???
  def lerp(v: Vector4, alpha: Double): Vector4 = ???
  def equals(v: Vector4): Boolean = ???
  def fromArray(xyzw: js.Array[Double]): js.Array[Double] = ???
  def toArray(): js.Array[Double] = ???
  override def clone(): Vector4 = ???
}

@JSName("THREE.Bone")
class Bone  extends Object3D {
  def this(belongsToSkin: SkinnedMesh) = this()
  var skin: SkinnedMesh = ???
  var accumulatedRotWeight: Double = ???
  var accumulatedPosWeight: Double = ???
  var accumulatedSclWeight: Double = ???
  override def updateMatrixWorld(forceUpdate: Boolean): Unit = ???
}

@JSName("THREE.Line")
class Line  extends Object3D {
  def this(geometry: Geometry = ???, material: LineDashedMaterial = ???, `type`: Double = ???) = this()
  var geometry: Geometry = ???
  var material: LineBasicMaterial = ???
  var `type`: LineType = ???
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = ???
  def clone(`object`: Line): Line = ???
}

sealed trait LineType extends js.Object {
}

@JSName("THREE.LineType")
object LineType extends js.Object {
  @JSBracketAccess
  def apply(value: LineType): String = ???
}

@JSName("THREE.LOD")
class LOD extends Object3D {
  var objects: js.Array[js.Any] = ???
  def addLevel(`object`: Object3D, distance: Double = ???): Unit = ???
  def getObjectForDistance(distance: Double): Object3D = ???
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = ???
  def update(camera: Camera): Unit = ???
  def clone(`object`: LOD): LOD = ???
}

@JSName("THREE.Mesh")
class Mesh  extends Object3D {
  def this(geometry: Geometry = ???, material: Material = ???) = this()
  var geometry: Geometry = ???
  var material: Material = ???
  def updateMorphTargets(): Unit = ???
  def getMorphTargetIndexByName(name: String): Double = ???
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = ???
  def clone(`object`: Mesh): Mesh = ???
}

@JSName("THREE.MorphAnimMesh")
class MorphAnimMesh  extends Mesh {
  def this(geometry: Geometry = ???, material: MeshBasicMaterial = ???) = this()
  var duration: Double = ???
  var mirroredLoop: Boolean = ???
  var time: Double = ???
  var lastKeyframe: Double = ???
  var currentKeyframe: Double = ???
  var direction: Double = ???
  var directionBackwards: Boolean = ???
  var startKeyframe: Double = ???
  var endKeyframe: Double = ???
  var length: Double = ???
  def setFrameRange(start: Double, end: Double): Unit = ???
  def setDirectionForward(): Unit = ???
  def setDirectionBackward(): Unit = ???
  def parseAnimations(): Unit = ???
  def setAnimationLabel(label: String, start: Double, end: Double): Unit = ???
  def playAnimation(label: String, fps: Double): Unit = ???
  def updateAnimation(delta: Double): Unit = ???
  def interpolateTargets(a: Double, b: Double, t: Double): Unit = ???
  def clone(`object`: MorphAnimMesh): MorphAnimMesh = ???
}

@JSName("THREE.PointCloud")
class PointCloud  extends Object3D {
  def this(geometry: Geometry, material: PointCloudMaterial = ???) = this()
  var geometry: Geometry = ???
  var material: Material = ???
  var sortParticles: Boolean = ???
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = ???
  def clone(`object`: PointCloud): PointCloud = ???
}

@JSName("THREE.Skeleton")
class Skeleton  extends js.Object {
  def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4] = ???, useVertexTexture: Boolean = ???) = this()
  var useVertexTexture: Boolean = ???
  var identityMatrix: Matrix4 = ???
  var bones: js.Array[Bone] = ???
  var boneTextureWidth: Double = ???
  var boneTextureHeight: Double = ???
  var boneMatrices: Float32Array = ???
  var boneTexture: DataTexture = ???
  var boneInverses: js.Array[Matrix4] = ???
  def calculateInverses(bone: Bone): Unit = ???
  def pose(): Unit = ???
  def update(): Unit = ???
}

@JSName("THREE.SkinnedMesh")
class SkinnedMesh  extends Mesh {
  def this(geometry: Geometry = ???, material: MeshBasicMaterial = ???, useVertexTexture: Boolean = ???) = this()
  var bindMode: String = ???
  var bindMatrix: Matrix4 = ???
  var bindMatrixInverse: Matrix4 = ???
  def bind(skeleton: Skeleton): Unit = ???
  def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = ???
  def pose(): Unit = ???
  def normalizeSkinWeights(): Unit = ???
  def clone(`object`: SkinnedMesh): SkinnedMesh = ???
  var skeleton: Skeleton = ???
}

@JSName("THREE.Sprite")
class Sprite  extends Object3D {
  def this(material: Material = ???) = this()
  var geometry: BufferGeometry = ???
  var material: SpriteMaterial = ???
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = ???
  override def updateMatrix(): Unit = ???
  def clone(`object`: Sprite): Sprite = ???
}

trait Renderer extends js.Object {
  def render(scene: Scene, camera: Camera): Unit = ???
  def setSize(width: Double, height: Double, updateStyle: Boolean = ???): Unit = ???
  var domElement: HTMLCanvasElement = ???
}

trait CanvasRendererParameters extends js.Object {
  var canvas: HTMLCanvasElement = ???
  var devicePixelRatio: Double = ???
}

@JSName("THREE.CanvasRenderer")
class CanvasRenderer  extends Renderer {
  def this(parameters: CanvasRendererParameters = ???) = this()

  var devicePixelRatio: Double = ???
  var autoClear: Boolean = ???
  var sortObjects: Boolean = ???
  var sortElements: Boolean = ???
  var info: js.Any = ???
  def supportsVertexTextures(): Unit = ???
  def setFaceCulling(): Unit = ???
  override def setSize(width: Double, height: Double, updateStyle: Boolean = ???): Unit = ???
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = ???
  def setScissor(): Unit = ???
  def enableScissorTest(): Unit = ???
  def setClearColor(color: Color, opacity: Double = ???): Unit = ???
  def setClearColorHex(hex: Double, alpha: Double = ???): Unit = ???
  def getClearColor(): Color = ???
  def getClearAlpha(): Double = ???
  def getMaxAnisotropy(): Double = ???
  def clear(): Unit = ???
  def clearColor(): Unit = ???
  def clearDepth(): Unit = ???
  def clearStencil(): Unit = ???
  override def render(scene: Scene, camera: Camera): Unit = ???
}

trait RendererPlugin extends js.Object {
  def init(renderer: WebGLRenderer): Unit = ???
  def render(scene: Scene, camera: Camera, currentWidth: Double, currentHeight: Double): Unit = ???
}

trait WebGLRendererParameters extends js.Object {
  var canvas: HTMLCanvasElement = ???
  var precision: String = ???
  var alpha: Boolean = ???
  var premultipliedAlpha: Boolean = ???
  var antialias: Boolean = ???
  var stencil: Boolean = ???
  var preserveDrawingBuffer: Boolean = ???
  var clearColor: Double = ???
  var clearAlpha: Double = ???
  var devicePixelRatio: Double = ???
}

@JSName("THREE.WebGLRenderer")
class WebGLRenderer  extends Renderer {
  def this(parameters: WebGLRendererParameters = ???) = this()

  var context: js.Any = ???
  var devicePixelRatio: Double = ???
  var autoClear: Boolean = ???
  var autoClearColor: Boolean = ???
  var autoClearDepth: Boolean = ???
  var autoClearStencil: Boolean = ???
  var sortObjects: Boolean = ???
  var gammaInput: Boolean = ???
  var gammaOutput: Boolean = ???
  var shadowMapEnabled: Boolean = ???
  var shadowMapAutoUpdate: Boolean = ???
  var shadowMapType: ShadowMapType = ???
  var shadowMapCullFace: CullFace = ???
  var shadowMapDebug: Boolean = ???
  var shadowMapCascade: Boolean = ???
  var maxMorphTargets: Double = ???
  var maxMorphNormals: Double = ???
  var autoScaleCubemaps: Boolean = ???
  var renderPluginsPre: js.Array[RendererPlugin] = ???
  var renderPluginsPost: js.Array[RendererPlugin] = ???
  var info: js.Any = ???
  var shadowMapPlugin: ShadowMapPlugin = ???
  def getContext(): WebGLRenderingContext = ???
  def supportsVertexTextures(): Boolean = ???
  def supportsFloatTextures(): Boolean = ???
  def supportsStandardDerivatives(): Boolean = ???
  def supportsCompressedTextureS3TC(): Boolean = ???
  def getMaxAnisotropy(): Double = ???
  def getPrecision(): String = ???
  override def setSize(width: Double, height: Double, updateStyle: Boolean = ???): Unit = ???
  def setViewport(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): Unit = ???
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = ???
  def enableScissorTest(enable: Boolean): Unit = ???
  def setClearColor(color: Color, alpha: Double = ???): Unit = ???
  def setClearColorHex(hex: Double, alpha: Double): Unit = ???
  def getClearColor(): Color = ???
  def getClearAlpha(): Double = ???
  def clear(color: Boolean = ???, depth: Boolean = ???, stencil: Boolean = ???): Unit = ???
  def clearColor(): Unit = ???
  def clearDepth(): Unit = ???
  def clearStencil(): Unit = ???
  def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = ???
  def addPostPlugin(plugin: RendererPlugin): Unit = ???
  def addPrePlugin(plugin: RendererPlugin): Unit = ???
  def updateShadowMap(scene: Scene, camera: Camera): Unit = ???
  def renderBufferImmediate(`object`: Object3D, program: Object, material: Material): Unit = ???
  def renderBufferDirect(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, geometryGroup: js.Any, `object`: Object3D): Unit = ???
  def renderBuffer(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, geometryGroup: js.Any, `object`: Object3D): Unit = ???
  def render(scene: Scene, camera: Camera, renderTarget: RenderTarget = ???, forceClear: Boolean = ???): Unit = ???
  def renderImmediateObject(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, `object`: Object3D): Unit = ???
  def initMaterial(material: Material, lights: js.Array[Light], fog: Fog, `object`: Object3D): Unit = ???
  def setFaceCulling(cullFace: CullFace = ???, frontFace: FrontFaceDirection = ???): Unit = ???
  def setMaterialFaces(material: Material): Unit = ???
  def setDepthTest(depthTest: Boolean): Unit = ???
  def setDepthWrite(depthWrite: Boolean): Unit = ???
  def setBlending(blending: Blending, blendEquation: BlendingEquation, blendSrc: BlendingSrcFactor, blendDst: BlendingDstFactor): Unit = ???
  def setTexture(texture: Texture, slot: Double): Unit = ???
  def setRenderTarget(renderTarget: RenderTarget): Unit = ???
}

trait RenderTarget extends js.Object {
}

trait WebGLRenderTargetOptions extends js.Object {
  var wrapS: Wrapping = ???
  var wrapT: Wrapping = ???
  var magFilter: TextureFilter = ???
  var minFilter: TextureFilter = ???
  var anisotropy: Double = ???
  var format: Double = ???
  var `type`: TextureDataType = ???
  var depthBuffer: Boolean = ???
  var stencilBuffer: Boolean = ???
}

@JSName("THREE.WebGLRenderTarget")
class WebGLRenderTarget  extends RenderTarget {
  def this(width: Double, height: Double, options: WebGLRenderTargetOptions = ???) = this()
  var width: Double = ???
  var height: Double = ???
  var wrapS: Wrapping = ???
  var wrapT: Wrapping = ???
  var magFilter: TextureFilter = ???
  var minFilter: TextureFilter = ???
  var anisotropy: Double = ???
  var offset: Vector2 = ???
  var repeat: Vector2 = ???
  var format: Double = ???
  var `type`: Double = ???
  var depthBuffer: Boolean = ???
  var stencilBuffer: Boolean = ???
  var generateMipmaps: Boolean = ???
  var shareDepthFrom: js.Any = ???
  override def clone(): WebGLRenderTarget = ???
  def dispose(): Unit = ???
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

@JSName("THREE.WebGLRenderTargetCube")
class WebGLRenderTargetCube  extends WebGLRenderTarget {
  def this(width: Double, height: Double, options: WebGLRenderTargetOptions = ???) = this()
  var activeCubeFace: Double = ???
}

@JSName("THREE.RenderableFace")
class RenderableFace extends js.Object {
  var id: Double = ???
  var v1: RenderableVertex = ???
  var v2: RenderableVertex = ???
  var v3: RenderableVertex = ???
  var normalModel: Vector3 = ???
  var vertexNormalsModel: js.Array[Vector3] = ???
  var vertexNormalsLength: Double = ???
  var color: Color = ???
  var material: Material = ???
  var uvs: js.Array[js.Array[Vector2]] = ???
  var z: Double = ???
}

@JSName("THREE.RenderableLine")
class RenderableLine extends js.Object {
  var id: Double = ???
  var v1: RenderableVertex = ???
  var v2: RenderableVertex = ???
  var vertexColors: js.Array[Color] = ???
  var material: Material = ???
  var z: Double = ???
}

@JSName("THREE.RenderableObject")
class RenderableObject extends js.Object {
  var id: Double = ???
  var `object`: Object = ???
  var z: Double = ???
}

@JSName("THREE.RenderableSprite")
class RenderableSprite extends js.Object {
  var id: Double = ???
  var `object`: Object = ???
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
  var rotation: Double = ???
  var scale: Vector2 = ???
  var material: Material = ???
}

@JSName("THREE.RenderableVertex")
class RenderableVertex extends js.Object {
  var position: Vector3 = ???
  var positionWorld: Vector3 = ???
  var positionScreen: Vector4 = ???
  var visible: Boolean = ???
  def copy(vertex: RenderableVertex): Unit = ???
}

trait ShaderChunk extends js.Object {
  @JSBracketAccess
  def apply(name: String): String = ???
  @JSBracketAccess
  def update(name: String, v: String): Unit = ???
  var alphamap_fragment: String = ???
  var alphamap_pars_fragment: String = ???
  var alphatest_fragment: String = ???
  var bumpmap_pars_fragment: String = ???
  var color_fragment: String = ???
  var color_pars_fragment: String = ???
  var color_pars_vertex: String = ???
  var color_vertex: String = ???
  var default_vertex: String = ???
  var defaultnormal_vertex: String = ???
  var envmap_fragment: String = ???
  var envmap_pars_fragment: String = ???
  var envmap_pars_vertex: String = ???
  var envmap_vertex: String = ???
  var fog_fragment: String = ???
  var fog_pars_fragment: String = ???
  var lightmap_fragment: String = ???
  var lightmap_pars_fragment: String = ???
  var lightmap_pars_vertex: String = ???
  var lightmap_vertex: String = ???
  var lights_lambert_pars_vertex: String = ???
  var lights_lambert_vertex: String = ???
  var lights_phong_fragment: String = ???
  var lights_phong_pars_fragment: String = ???
  var lights_phong_pars_vertex: String = ???
  var lights_phong_vertex: String = ???
  var linear_to_gamma_fragment: String = ???
  var logdepthbuf_fragment: String = ???
  var logdepthbuf_pars_fragment: String = ???
  var logdepthbuf_pars_vertex: String = ???
  var logdepthbuf_vertex: String = ???
  var map_fragment: String = ???
  var map_pars_fragment: String = ???
  var map_pars_vertex: String = ???
  var map_particle_fragment: String = ???
  var map_particle_pars_fragment: String = ???
  var map_vertex: String = ???
  var morphnormal_vertex: String = ???
  var morphtarget_pars_vertex: String = ???
  var morphtarget_vertex: String = ???
  var normalmap_pars_fragment: String = ???
  var shadowmap_fragment: String = ???
  var shadowmap_pars_fragment: String = ???
  var shadowmap_pars_vertex: String = ???
  var shadowmap_vertex: String = ???
  var skinbase_vertex: String = ???
  var skinning_pars_vertex: String = ???
  var skinning_vertex: String = ???
  var skinnormal_vertex: String = ???
  var specularmap_fragment: String = ???
  var specularmap_pars_fragment: String = ???
  var worldpos_vertex: String = ???
}

trait Shader extends js.Object {
  var uniforms: js.Any = ???
  var vertexShader: String = ???
  var fragmentShader: String = ???
}

@JSName("THREE.ShaderLib")
object ShaderLib extends js.Object {
  @JSBracketAccess
  def apply(name: String): Shader = ???
  @JSBracketAccess
  def update(name: String, v: Shader): Unit = ???
  var basic: Shader = ???
  var lambert: Shader = ???
  var phong: Shader = ???
  var particle_basic: Shader = ???
  var dashed: Shader = ???
  var depth: Shader = ???
  var normal: Shader = ???
  var normalmap: Shader = ???
  var cube: Shader = ???
  var depthRGBA: Shader = ???
}

@JSName("THREE.UniformsLib")
object UniformsLib extends js.Object {
  var common: js.Any = ???
  var bump: js.Any = ???
  var normalmap: js.Any = ???
  var fog: js.Any = ???
  var lights: js.Any = ???
  var particle: js.Any = ???
  var shadowmap: js.Any = ???
}

@JSName("THREE.UniformsUtils")
object UniformsUtils extends js.Object {
  def merge(uniforms: js.Array[js.Any]): js.Dynamic = ???
  def clone(uniforms_src: js.Any): js.Dynamic = ???
}

@JSName("THREE.WebGLProgram")
class WebGLProgram  extends js.Object {
  def this(renderer: WebGLRenderer, code: String, material: ShaderMaterial, parameters: WebGLRendererParameters) = this()
}

@JSName("THREE.WebGLShader")
class WebGLShader  extends js.Object {
  def this(gl: js.Any, `type`: String, string: String) = this()
}

trait IFog extends js.Object {
  var name: String = ???
  var color: Color = ???
  override def clone(): IFog = ???
}

@JSName("THREE.Fog")
class Fog  extends IFog {
  def this(hex: Double, near: Double = ???, far: Double = ???) = this()


  var near: Double = ???
  var far: Double = ???
  override def clone(): Fog = ???
}

@JSName("THREE.FogExp2")
class FogExp2  extends IFog {
  def this(hex: Double, density: Double = ???) = this()


  var density: Double = ???
  override def clone(): FogExp2 = ???
}

@JSName("THREE.Scene")
class Scene extends Object3D {
  var fog: IFog = ???
  var overrideMaterial: Material = ???
  var autoUpdate: Boolean = ???

}

@JSName("THREE.CompressedTexture")
class CompressedTexture  extends Texture {
  def this(mipmaps: js.Array[ImageData], width: Double, height: Double, format: PixelFormat = ???, `type`: TextureDataType = ???, mapping: Mapping = ???, wrapS: Wrapping = ???, wrapT: Wrapping = ???, magFilter: TextureFilter = ???, minFilter: TextureFilter = ???, anisotropy: Double = ???) = this()



  override def clone(): CompressedTexture = ???
}

@JSName("THREE.CubeTexture")
class CubeTexture  extends Texture {
  def this(images: js.Array[js.Any], mapping: Mapping = ???, wrapS: Wrapping = ???, wrapT: Wrapping = ???, magFilter: TextureFilter = ???, minFilter: TextureFilter = ???, format: PixelFormat = ???, `type`: TextureDataType = ???, anisotropy: Double = ???) = this()
  var images: js.Array[js.Any] = ???
  def clone(texture: CubeTexture): CubeTexture = ???
}

@JSName("THREE.DataTexture")
class DataTexture  extends Texture {
  def this(data: ImageData, width: Double, height: Double, format: PixelFormat, `type`: TextureDataType, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, anisotropy: Double = ???) = this()

  override def clone(): DataTexture = ???
}

@JSName("THREE.Texture")
class Texture  extends js.Object {
  def this(image: js.Any, mapping: Mapping = ???, wrapS: Wrapping = ???, wrapT: Wrapping = ???, magFilter: TextureFilter = ???, minFilter: TextureFilter = ???, format: PixelFormat = ???, `type`: TextureDataType = ???, anisotropy: Double = ???) = this()
  var id: Double = ???
  var uuid: String = ???
  var name: String = ???
  var image: js.Any = ???
  var mipmaps: js.Array[ImageData] = ???
  var mapping: Mapping = ???
  var wrapS: Wrapping = ???
  var wrapT: Wrapping = ???
  var magFilter: TextureFilter = ???
  var minFilter: TextureFilter = ???
  var anisotropy: Double = ???
  var format: PixelFormat = ???
  var `type`: TextureDataType = ???
  var offset: Vector2 = ???
  var repeat: Vector2 = ???
  var generateMipmaps: Boolean = ???
  var premultiplyAlpha: Boolean = ???
  var flipY: Boolean = ???
  var unpackAlignment: Double = ???
  var needsUpdate: Boolean = ???
  var onUpdate: js.Function0[Unit] = ???
  override def clone(): Texture = ???
  def update(): Unit = ???
  def dispose(): Unit = ???
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = ???
  def dispatchEvent(event: js.Any): Unit = ???
}

@JSName("THREE.Texture")
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = ???
  var DEFAULT_MAPPING: js.Any = ???
}

trait TypefaceData extends js.Object {
  var familyName: String = ???
  var cssFontWeight: String = ???
  var cssFontStyle: String = ???
}

@JSName("THREE.FontUtils")
object FontUtils extends js.Object {
  var faces: js.Any = ???
  var face: String = ???
  var weight: String = ???
  var style: String = ???
  var size: Double = ???
  var divisions: Double = ???
  def getFace(): Face3 = ???
  def loadFace(data: TypefaceData): TypefaceData = ???
  def drawText(text: String): js.Any = ???
  def extractGlyphPoints(c: String, face: Face3, scale: Double, offset: Double, path: Path): js.Any = ???
  def generateShapes(text: String, parameters: js.Any = ???): js.Array[Shape] = ???
  var Triangulate: js.Any = ???
}

@JSName("THREE.GeometryUtils")
object GeometryUtils extends js.Object {
  def merge(geometry1: Geometry, object2: Mesh, materialIndexOffset: Double = ???): Unit = ???
  def center(geometry: Geometry): Vector3 = ???
}

@JSName("THREE.ImageUtils")
object ImageUtils extends js.Object {
  var crossOrigin: String = ???
  def loadTexture(url: String, mapping: Mapping = ???, onLoad: js.Function1[Texture, Unit] = ???, onError: js.Function1[String, Unit] = ???): Texture = ???
  def loadTextureCube(array: js.Array[String], mapping: Mapping = ???, onLoad: js.Function1[Texture, Unit] = ???, onError: js.Function1[String, Unit] = ???): Texture = ???
  def getNormalMap(image: HTMLImageElement, depth: Double = ???): HTMLCanvasElement = ???
  def generateDataTexture(width: Double, height: Double, color: Color): DataTexture = ???
}

@JSName("THREE.SceneUtils")
object SceneUtils extends js.Object {
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = ???
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = ???
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = ???
}

trait KeyFrame extends js.Object {
  var pos: js.Array[Double] = ???
  var rot: js.Array[Double] = ???
  var scl: js.Array[Double] = ???
  var time: Double = ???
}

trait KeyFrames extends js.Object {
  var keys: js.Array[KeyFrame] = ???
  var parent: Double = ???
}

trait AnimationData extends js.Object {
  var JIT: Double = ???
  var fps: Double = ???
  var hierarchy: js.Array[KeyFrames] = ???
  var length: Double = ???
  var name: String = ???
}

@JSName("THREE.Animation")
class Animation  extends js.Object {
  def this(root: Mesh, data: AnimationData) = this()
  var root: Mesh = ???
  var data: AnimationData = ???
  var hierarchy: js.Array[Bone] = ???
  var currentTime: Double = ???
  var timeScale: Double = ???
  var isPlaying: Boolean = ???
  var loop: Boolean = ???
  var weight: Double = ???
  var keyTypes: js.Array[String] = ???
  var interpolationType: Double = ???
  def play(startTime: Double = ???, weight: Double = ???): Unit = ???
  def stop(): Unit = ???
  def reset(): Unit = ???
  def update(deltaTimeMS: Double): Unit = ???
  def getNextKeyWith(`type`: String, h: Double, key: Double): KeyFrame = ???
  def getPrevKeyWith(`type`: String, h: Double, key: Double): KeyFrame = ???
}

@JSName("THREE.AnimationHandler")
object AnimationHandler extends js.Object {
  var LINEAR: Double = ???
  var CATMULLROM: Double = ???
  var CATMULLROM_FORWARD: Double = ???
  var animations: js.Array[js.Any] = ???
  def init(data: Animation): Unit = ???
  def parse(root: Mesh): js.Array[Object3D] = ???
  def play(animation: Animation): Unit = ???
  def stop(animation: Animation): Unit = ???
  def update(deltaTimeMS: Double): Unit = ???
}

@JSName("THREE.KeyFrameAnimation")
class KeyFrameAnimation  extends js.Object {
  def this(data: js.Any) = this()
  var root: Mesh = ???
  var data: Object = ???
  var hierarchy: js.Array[KeyFrames] = ???
  var currentTime: Double = ???
  var timeScale: Double = ???
  var isPlaying: Boolean = ???
  var isPaused: Boolean = ???
  var loop: Boolean = ???
  def play(startTime: Double = ???): Unit = ???
  def stop(): Unit = ???
  def update(delta: Double): Unit = ???
  def getNextKeyWith(`type`: String, h: Double, key: Double): KeyFrame = ???
  def getPrevKeyWith(`type`: String, h: Double, key: Double): KeyFrame = ???
}

@JSName("THREE.MorphAnimation")
class MorphAnimation  extends js.Object {
  def this(mesh: Mesh) = this()
  var mesh: Mesh = ???
  var frames: Double = ???
  var currentTime: Double = ???
  var duration: Double = ???
  var loop: Boolean = ???
  var isPlaying: Boolean = ???
  def play(): Unit = ???
  def pause(): Unit = ???
  def update(deltaTimeMS: Double): Unit = ???
}

@JSName("THREE.Curve")
class Curve extends js.Object {
  def getPoint(t: Double): Vector = ???
  def getPointAt(u: Double): Vector = ???
  def getPoints(divisions: Double): js.Array[Vector] = ???
  def getSpacedPoints(divisions: Double): js.Array[Vector] = ???
  def getLength(): Double = ???
  def getLengths(divisions: Double): js.Array[Double] = ???
  def updateArcLengths(): Unit = ???
  def getUtoTmapping(u: Double, distance: Double): Double = ???
  def getTangent(t: Double): Vector = ???
  def getTangentAt(u: Double): Vector = ???
}

@JSName("THREE.Curve")
object Curve extends js.Object {
  var Utils: js.Any = ???
  def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = ???
}

trait BoundingBox extends js.Object {
  var minX: Double = ???
  var minY: Double = ???
  var maxX: Double = ???
  var maxY: Double = ???
  var centroid: Vector = ???
}

@JSName("THREE.CurvePath")
class CurvePath extends Curve {
  var curves: js.Array[Curve] = ???
  var bends: js.Array[Path] = ???
  var autoClose: Boolean = ???
  def add(curve: Curve): Unit = ???
  def checkConnection(): Boolean = ???
  def closePath(): Unit = ???
  override def getPoint(t: Double): Vector = ???
  override def getLength(): Double = ???
  def getCurveLengths(): Double = ???
  def getBoundingBox(): BoundingBox = ???
  def createPointsGeometry(divisions: Double): Geometry = ???
  def createSpacedPointsGeometry(divisions: Double): Geometry = ???
  def createGeometry(points: js.Array[Vector2]): Geometry = ???
  def addWrapPath(bendpath: Path): Unit = ???
  def getTransformedPoints(segments: Double, bends: Path = ???): js.Array[Vector2] = ???
  def getTransformedSpacedPoints(segments: Double, bends: js.Array[Path] = ???): js.Array[Vector2] = ???
  def getWrapPoints(oldPts: js.Array[Vector2], path: Path): js.Array[Vector2] = ???
}

@JSName("THREE.Gyroscope")
class Gyroscope extends Object3D {
  var translationWorld: Vector3 = ???
  var translationObject: Vector3 = ???
  var quaternionWorld: Quaternion = ???
  var quaternionObject: Quaternion = ???
  var scaleWorld: Vector3 = ???
  var scaleObject: Vector3 = ???
  override def updateMatrixWorld(force: Boolean): Unit = ???
}

sealed trait PathActions extends js.Object {
}

@JSName("THREE.PathActions")
object PathActions extends js.Object {
  var MOVE_TO: PathActions = ???
  var LINE_TO: PathActions = ???
  var QUADRATIC_CURVE_TO: PathActions = ???
  var BEZIER_CURVE_TO: PathActions = ???
  var CSPLINE_THRU: PathActions = ???
  var ARC: PathActions = ???
  var ELLIPSE: PathActions = ???
  @JSBracketAccess
  def apply(value: PathActions): String = ???
}

trait PathAction extends js.Object {
  var action: PathActions = ???
  var args: js.Any = ???
}

@JSName("THREE.Path")
class Path  extends CurvePath {
  def this(points: Vector2 = ???) = this()
  var actions: js.Array[PathAction] = ???
  def fromPoints(vectors: js.Array[Vector2]): Unit = ???
  def moveTo(x: Double, y: Double): Unit = ???
  def lineTo(x: Double, y: Double): Unit = ???
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = ???
  def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = ???
  def splineThru(pts: js.Array[Vector2]): Unit = ???
  def arc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = ???
  def absarc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = ???
  def ellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = ???
  def absellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = ???
  def getSpacedPoints(): js.Array[Vector] = ???
  def getSpacedPoints(divisions: Double, closedPath: Boolean): js.Array[Vector] = ???
  def getPoints(): js.Array[Vector] = ???
  def getPoints(divisions: Double, closedPath: Boolean): js.Array[Vector] = ???
  def toShapes(): js.Array[Shape] = ???
}

@JSName("THREE.Shape")
class Shape  extends Path {
  def this(points: js.Array[Vector2] = ???) = this()
  var holes: js.Array[Path] = ???
  def extrude(): ExtrudeGeometry = ???
  def extrude(options: js.Any): ExtrudeGeometry = ???
  def makeGeometry(): ShapeGeometry = ???
  def makeGeometry(options: js.Any): ShapeGeometry = ???

  def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = ???
  def getSpacedPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = ???
  def extractAllPoints(divisions: Double): js.Any = ???
  def extractPoints(divisions: Double): js.Array[Vector2] = ???
  def extractAllSpacedPoints(divisions: Vector2): js.Any = ???
}

@JSName("THREE.ArcCurve")
class ArcCurve  extends EllipseCurve {
  def this(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean) = this()
}

@JSName("THREE.ClosedSplineCurve3")
class ClosedSplineCurve3  extends Curve {
  def this(points: js.Array[Vector3] = ???) = this()
  var points: js.Array[Vector3] = ???
  override def getPoint(t: Double): Vector3 = ???
}

@JSName("THREE.CubicBezierCurve")
class CubicBezierCurve  extends Curve {
  def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
  var v0: Vector2 = ???
  var v1: Vector2 = ???
  var v2: Vector2 = ???
  var v3: Vector2 = ???
  override def getPoint(t: Double): Vector2 = ???
  override def getTangent(t: Double): Vector2 = ???
}

@JSName("THREE.CubicBezierCurve3")
class CubicBezierCurve3  extends Curve {
  def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
  var v0: Vector3 = ???
  var v1: Vector3 = ???
  var v2: Vector3 = ???
  var v3: Vector3 = ???
  override def getPoint(t: Double): Vector3 = ???
}

@JSName("THREE.EllipseCurve")
class EllipseCurve  extends Curve {
  def this(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean) = this()
  var aX: Double = ???
  var aY: Double = ???
  var xRadius: Double = ???
  var yRadius: Double = ???
  var aStartAngle: Double = ???
  var aEndAngle: Double = ???
  var aClockwise: Boolean = ???
  override def getPoint(t: Double): Vector2 = ???
}

@JSName("THREE.LineCurve")
class LineCurve  extends Curve {
  def this(v1: Vector2, v2: Vector2) = this()
  var v1: Vector2 = ???
  var v2: Vector2 = ???
  override def getPoint(t: Double): Vector2 = ???
  override def getPointAt(u: Double): Vector2 = ???
  override def getTangent(t: Double): Vector2 = ???
}

@JSName("THREE.LineCurve3")
class LineCurve3  extends Curve {
  def this(v1: Vector3, v2: Vector3) = this()
  var v1: Vector3 = ???
  var v2: Vector3 = ???
  override def getPoint(t: Double): Vector3 = ???
}

@JSName("THREE.QuadraticBezierCurve")
class QuadraticBezierCurve  extends Curve {
  def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
  var v0: Vector2 = ???
  var v1: Vector2 = ???
  var v2: Vector2 = ???
  override def getPoint(t: Double): Vector2 = ???
  override def getTangent(t: Double): Vector2 = ???
}

@JSName("THREE.QuadraticBezierCurve3")
class QuadraticBezierCurve3  extends Curve {
  def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
  var v0: Vector3 = ???
  var v1: Vector3 = ???
  var v2: Vector3 = ???
  override def getPoint(t: Double): Vector3 = ???
}

@JSName("THREE.SplineCurve")
class SplineCurve  extends Curve {
  def this(points: js.Array[Vector2] = ???) = this()
  var points: js.Array[Vector2] = ???
  override def getPoint(t: Double): Vector2 = ???
}

@JSName("THREE.SplineCurve3")
class SplineCurve3  extends Curve {
  def this(points: js.Array[Vector3] = ???) = this()
  var points: js.Array[Vector3] = ???
  override def getPoint(t: Double): Vector3 = ???
}

@JSName("THREE.BoxGeometry")
class BoxGeometry  extends Geometry {
  def this(width: Double, height: Double, depth: Double, widthSegments: Double = ???, heightSegments: Double = ???, depthSegments: Double = ???) = this()
  var parameters: js.Any = ???
  var widthSegments: Double = ???
  var heightSegments: Double = ???
  var depthSegments: Double = ???
}

@JSName("THREE.CircleGeometry")
class CircleGeometry  extends Geometry {
  def this(radius: Double = ???, segments: Double = ???, thetaStart: Double = ???, thetaLength: Double = ???) = this()
  var parameters: js.Any = ???
  var radius: Double = ???
  var segments: Double = ???
  var thetaStart: Double = ???
  var thetaLength: Double = ???
}

@JSName("THREE.CubeGeometry")
class CubeGeometry extends BoxGeometry {
}

@JSName("THREE.CylinderGeometry")
class CylinderGeometry  extends Geometry {
  def this(radiusTop: Double = ???, radiusBottom: Double = ???, height: Double = ???, radiusSegments: Double = ???, heightSegments: Double = ???, openEnded: Boolean = ???) = this()
  var parameters: js.Any = ???
  var radiusTop: Double = ???
  var radiusBottom: Double = ???
  var height: Double = ???
  var radialSegments: Double = ???
  var heightSegments: Double = ???
  var openEnded: Boolean = ???
}

@JSName("THREE.ExtrudeGeometry")
class ExtrudeGeometry  extends Geometry {
  def this(shape: Shape) = this()
  def this(shape: Shape, options: js.Any) = this()
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: js.Array[Shape], options: js.Any) = this()

  def addShapeList(shapes: js.Array[Shape], options: js.Any = ???): Unit = ???
  def addShape(shape: Shape, options: js.Any = ???): Unit = ???
}

@JSName("THREE.IcosahedronGeometry")
class IcosahedronGeometry  extends PolyhedronGeometry {
  def this(radius: Double, detail: Double) = this()
  var parameters: js.Any = ???
  var radius: Double = ???
  var detail: Double = ???
}

@JSName("THREE.LatheGeometry")
class LatheGeometry  extends Geometry {
  def this(points: js.Array[Vector3], segments: Double = ???, phiStart: Double = ???, phiLength: Double = ???) = this()
}

@JSName("THREE.OctahedronGeometry")
class OctahedronGeometry  extends PolyhedronGeometry {
  def this(radius: Double, detail: Double) = this()
  var parameters: js.Any = ???
  var radius: Double = ???
  var detail: Double = ???
}

@JSName("THREE.ParametricGeometry")
class ParametricGeometry  extends Geometry {
  def this(func: js.Function2[Double, Double, Vector3], slices: Double, stacks: Double, useTris: Boolean = ???) = this()
}

@JSName("THREE.PlaneGeometry")
class PlaneGeometry  extends Geometry {
  def this(width: Double, height: Double, widthSegments: Double = ???, heightSegments: Double = ???) = this()
  var parameters: js.Any = ???
  var width: Double = ???
  var height: Double = ???
  var widthSegments: Double = ???
  var heightSegments: Double = ???
}

@JSName("THREE.PolyhedronGeometry")
class PolyhedronGeometry  extends Geometry {
  def this(vertices: js.Array[Vector3], faces: js.Array[Face3], radius: Double = ???, detail: Double = ???) = this()
}

@JSName("THREE.RingGeometry")
class RingGeometry  extends Geometry {
  def this(innerRadius: Double = ???, outerRadius: Double = ???, thetaSegments: Double = ???, phiSegments: Double = ???, thetaStart: Double = ???, thetaLength: Double = ???) = this()
}

@JSName("THREE.ShapeGeometry")
class ShapeGeometry  extends Geometry {
  def this(shape: Shape) = this()
  def this(shape: Shape, options: js.Any) = this()

  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: js.Array[Shape], options: js.Any) = this()

  def addShapeList(shapes: js.Array[Shape], options: js.Any): ShapeGeometry = ???
  def addShape(shape: Shape, options: js.Any = ???): Unit = ???
}

@JSName("THREE.SphereGeometry")
class SphereGeometry  extends Geometry {
  def this(radius: Double, widthSegments: Double = ???, heightSegments: Double = ???, phiStart: Double = ???, phiLength: Double = ???, thetaStart: Double = ???, thetaLength: Double = ???) = this()
  var parameters: js.Any = ???
  var radius: Double = ???
  var widthSegments: Double = ???
  var heightSegments: Double = ???
  var phiStart: Double = ???
  var phiLength: Double = ???
  var thetaStart: Double = ???
  var thetaLength: Double = ???
}

@JSName("THREE.TetrahedronGeometry")
class TetrahedronGeometry  extends PolyhedronGeometry {
  def this(radius: Double = ???, detail: Double = ???) = this()
}

trait TextGeometryParameters extends js.Object {
  var size: Double = ???
  var height: Double = ???
  var curveSegments: Double = ???
  var font: String = ???
  var weight: String = ???
  var style: String = ???
  var bevelEnabled: Boolean = ???
  var bevelThickness: Double = ???
  var bevelSize: Double = ???
}

@JSName("THREE.TextGeometry")
class TextGeometry  extends ExtrudeGeometry {
  def this(text: String, TextGeometryParameters: TextGeometryParameters = ???) = this()
}

@JSName("THREE.TorusGeometry")
class TorusGeometry  extends Geometry {
  def this(radius: Double = ???, tube: Double = ???, radialSegments: Double = ???, tubularSegments: Double = ???, arc: Double = ???) = this()
  var parameters: js.Any = ???
  var radius: Double = ???
  var tube: Double = ???
  var radialSegments: Double = ???
  var tubularSegments: Double = ???
  var arc: Double = ???
}

@JSName("THREE.TorusKnotGeometry")
class TorusKnotGeometry  extends Geometry {
  def this(radius: Double = ???, tube: Double = ???, radialSegments: Double = ???, tubularSegments: Double = ???, p: Double = ???, q: Double = ???, heightScale: Double = ???) = this()
  var parameters: js.Any = ???
  var radius: Double = ???
  var tube: Double = ???
  var radialSegments: Double = ???
  var tubularSegments: Double = ???
  var p: Double = ???
  var q: Double = ???
  var heightScale: Double = ???
}

@JSName("THREE.TubeGeometry")
class TubeGeometry  extends Geometry {
  def this(path: Path, segments: Double = ???, radius: Double = ???, radiusSegments: Double = ???, closed: Boolean = ???) = this()
  var parameters: js.Any = ???
  var path: Path = ???
  var segments: Double = ???
  var radius: Double = ???
  var radialSegments: Double = ???
  var closed: Boolean = ???
  var tangents: js.Array[Vector3] = ???
  var normals: js.Array[Vector3] = ???
  var binormals: js.Array[Vector3] = ???
  def FrenetFrames(path: Path, segments: Double, closed: Boolean): Unit = ???
}

@JSName("THREE.ArrowHelper")
class ArrowHelper  extends Object3D {
  def this(dir: Vector3, origin: Vector3 = ???, length: Double = ???, hex: Double = ???, headLength: Double = ???, headWidth: Double = ???) = this()
  var line: Line = ???
  var cone: Mesh = ???
  def setDirection(dir: Vector3): Unit = ???
  def setLength(length: Double): Unit = ???
  def setLength(length: Double,headLength:Double): Unit = ???
  def setLength(length: Double,headLength:Double, headWidth:Double): Unit = ???
  def setColor(hex: Double): Unit = ???
}

@JSName("THREE.AxisHelper")
class AxisHelper  extends Line {
  def this(size: Double = ???) = this()
}

@JSName("THREE.BoundingBoxHelper")
class BoundingBoxHelper  extends Mesh {
  def this(`object`: Object3D, hex: Double = ???) = this()
  var `object`: Object3D = ???
  var box: js.Array[Box3] = ???
  def update(): Unit = ???
}

@JSName("THREE.BoxHelper")
class BoxHelper  extends Line {
  def this(`object`: Object3D = ???) = this()
  def update(`object`: Object3D = ???): Unit = ???
}

@JSName("THREE.CameraHelper")
class CameraHelper  extends Line {
  def this(camera: Camera) = this()
  var camera: Camera = ???
  var pointMap: js.Any = ???
  def update(): Unit = ???
}

@JSName("THREE.DirectionalLightHelper")
class DirectionalLightHelper  extends Object3D {
  def this(light: Light, size: Double = ???) = this()
  var light: Light = ???
  var lightPlane: Line = ???
  var targetLine: Line = ???
  def dispose(): Unit = ???
  def update(): Unit = ???
}

@JSName("THREE.EdgesHelper")
class EdgesHelper  extends Line {
  def this(`object`: Object3D, hex: Double = ???) = this()
}

@JSName("THREE.FaceNormalsHelper")
class FaceNormalsHelper  extends Line {
  def this(`object`: Object3D, size: Double = ???, hex: Double = ???, linewidth: Double = ???) = this()
  var `object`: Object3D = ???
  var size: Double = ???
  var normalMatrix: Matrix3 = ???
  def update(`object`: Object3D = ???): Unit = ???
}

@JSName("THREE.GridHelper")
class GridHelper  extends Line {
  def this(size: Double, step: Double) = this()
  var color1: Color = ???
  var color2: Color = ???
  def setColors(colorCenterLine: Double, colorGrid: Double): Unit = ???
}

@JSName("THREE.HemisphereLightHelper")
class HemisphereLightHelper  extends Object3D {
  def this(light: Light, sphereSize: Double, arrowLength: Double, domeSize: Double) = this()
  var light: Light = ???
  var colors: js.Array[Color] = ???
  var lightSphere: Mesh = ???
  def dispose(): Unit = ???
  def update(): Unit = ???
}

@JSName("THREE.PointLightHelper")
class PointLightHelper  extends Object3D {
  def this(light: Light, sphereSize: Double) = this()
  var light: Light = ???
  def dispose(): Unit = ???
  def update(): Unit = ???
}

@JSName("THREE.SkeletonHelper")
class SkeletonHelper  extends Line {
  def this(bone: Object3D) = this()
  var bones: js.Array[Bone] = ???
  var root: Object3D = ???
  def getBoneList(`object`: Object3D): js.Array[Bone] = ???
  def update(): Unit = ???
}

@JSName("THREE.SpotLightHelper")
class SpotLightHelper  extends Object3D {
  def this(light: Light, sphereSize: Double, arrowLength: Double) = this()
  var light: Light = ???
  var cone: Mesh = ???
  def dispose(): Unit = ???
  def update(): Unit = ???
}

@JSName("THREE.VertexNormalsHelper")
class VertexNormalsHelper  extends Line {
  def this(`object`: Object3D) = this()
  def this(`object`: Object3D, size: Double) = this()
  def this(`object`: Object3D, size: Double, hex: Double) = this()
  def this(`object`: Object3D, size: Double, hex: Double, linewidth: Double) = this()
  var `object`: Object3D = ???
  var size: Double = ???
  var normalMatrix: Matrix3 = ???
  def update(`object`: Object3D = ???): Unit = ???
}

@JSName("THREE.VertexTangentsHelper")
class VertexTangentsHelper  extends Line {
  def this(`object`: Object3D, size: Double = ???, hex: Double = ???, linewidth: Double = ???) = this()
  var `object`: Object3D = ???
  var size: Double = ???
  def update(`object`: Object3D = ???): Unit = ???
}

@JSName("THREE.WireframeHelper")
class WireframeHelper  extends Line {
  def this(`object`: Object3D, hex: Double = ???) = this()
}

@JSName("THREE.ImmediateRenderObject")
class ImmediateRenderObject extends Object3D {
  def render(renderCallback: js.Function): Unit = ???
}

trait LensFlareProperty extends js.Object {
  var texture: Texture = ???
  var size: Double = ???
  var distance: Double = ???
  var x: Double = ???
  var y: Double = ???
  var z: Double = ???
  var scale: Double = ???
  var rotation: Double = ???
  var opacity: Double = ???
  var color: Color = ???
  var blending: Blending = ???
}

@JSName("THREE.LensFlare")
class LensFlare  extends Object3D {
  def this(texture: Texture = ???, size: Double = ???, distance: Double = ???, blending: Blending = ???, color: Color = ???) = this()
  var lensFlares: js.Array[LensFlareProperty] = ???
  var positionScreen: Vector3 = ???
  var customUpdateCallback: js.Function1[LensFlare, Unit] = ???
  def add(texture: Texture, size: Double = ???, distance: Double = ???, blending: Blending = ???, color: Color = ???): Unit = ???
  override def add(obj: Object3D): Unit = ???
  def updateLensFlares(): Unit = ???
}

trait MorphBlendMeshAnimation extends js.Object {
  var startFrame: Double = ???
  var endFrame: Double = ???
  var length: Double = ???
  var fps: Double = ???
  var duration: Double = ???
  var lastFrame: Double = ???
  var currentFrame: Double = ???
  var active: Boolean = ???
  var time: Double = ???
  var direction: Double = ???
  var weight: Double = ???
  var directionBackwards: Boolean = ???
  var mirroredLoop: Boolean = ???
}

@JSName("THREE.MorphBlendMesh")
class MorphBlendMesh  extends Mesh {
  def this(geometry: Geometry, material: Material) = this()
  var animationsMap: js.Any = ???
  var animationsList: js.Array[MorphBlendMeshAnimation] = ???
  def createAnimation(name: String, start: Double, end: Double, fps: Double): Unit = ???
  def autoCreateAnimations(fps: Double): Unit = ???
  def setAnimationDirectionForward(name: String): Unit = ???
  def setAnimationDirectionBackward(name: String): Unit = ???
  def setAnimationFPS(name: String, fps: Double): Unit = ???
  def setAnimationDuration(name: String, duration: Double): Unit = ???
  def setAnimationWeight(name: String, weight: Double): Unit = ???
  def setAnimationTime(name: String, time: Double): Unit = ???
  def getAnimationTime(name: String): Double = ???
  def getAnimationDuration(name: String): Double = ???
  def playAnimation(name: String): Unit = ???
  def stopAnimation(name: String): Unit = ???
  def update(delta: Double): Unit = ???
}

@JSName("THREE.DepthPassPlugin")
class DepthPassPlugin extends RendererPlugin {
  var enabled: Boolean = ???
  var renderTarget: RenderTarget = ???
  def init(renderer: Renderer): Unit = ???
  def render(scene: Scene, camera: Camera): Unit = ???
  def update(scene: Scene, camera: Camera): Unit = ???
}

@JSName("THREE.LensFlarePlugin")
class LensFlarePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = ???
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = ???
}

@JSName("THREE.ShadowMapPlugin")
class ShadowMapPlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = ???
  def render(scene: Scene, camera: Camera): Unit = ???
  def update(scene: Scene, camera: Camera): Unit = ???
}

@JSName("THREE.SpritePlugin")
class SpritePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = ???
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = ???
}

@JSName("THREE")
@JSName("THREE.ShaderFlares")
object ShaderFlares extends js.Object {
  var lensFlareVertexTexture: js.Any = ???
  var lensFlare: js.Any = ???
}
