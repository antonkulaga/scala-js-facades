// Turn this project into a Scala.js project by importing these settings
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import ScalaJSKeys._

scalaJSSettings

Build.sameSettings

name := "interfaces"

scalaVersion := "2.11.2"

version := "0.1"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.scalatags" %%% "scalatags" % "0.4.0"
)
