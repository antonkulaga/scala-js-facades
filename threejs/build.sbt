// Turn this project into a Scala.js project by importing these settings
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import ScalaJSKeys._

scalaJSSettings

Build.sameSettings

name := "threejs"

scalaVersion := "2.11.2"

version := "0.0.68-0.1.1"

libraryDependencies ++= Seq(
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6",
  "com.scalatags" %%% "scalatags" % "0.4.0"
)
