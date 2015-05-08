import sbt.Keys._
import sbt._
import bintray._
import BintrayPlugin.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Versions {
  val scala = "2.11.6"
  val scalaTags = "0.5.1"
  val codeMirror = "5.2"
  val codeMirrorFacade = "5.2-0.4"
  val threeJs = "r71"
  val threeJsFacade =  "0.0.71-0.1.4"
}

object Build extends sbt.Build{


  lazy val sameSettings:Seq[Setting[_]] = Seq(

    organization := "org.denigma",

    scalaVersion := Versions.scala,

    resolvers += Resolver.sonatypeRepo("releases"),

    resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases"),

    scalacOptions ++= Seq( "-feature", "-language:_" ),

    libraryDependencies +=  "com.lihaoyi" %%% "scalatags" % Versions.scalaTags

  ) ++publishSettings


  lazy val publishSettings = Seq(
    bintrayRepository := "denigma-releases",

    bintrayOrganization := Some("denigma"),

    licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0")),

    bintrayPublishIvyStyle := true
  )

  /**
   * For parts of the project that we will not publish
   */
  lazy val noPublishSettings = Seq(
    publish := (),
    publishLocal := (),
    publishArtifact := false
  )

  lazy val scalajsOutputDir = Def.settingKey[File]("directory for javascript files output by scalajs")

  protected lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug


  val threeJsSettings = sameSettings ++ publishSettings ++ Seq(
    name := "threejs",
    version := Versions.threeJsFacade
  )


  lazy val threejs = Project( id= "threejs", base =  file("./threejs"), settings = threeJsSettings )
    .enablePlugins(ScalaJSPlugin,BintrayPlugin)

  val codeMirrorSettings = sameSettings ++ publishSettings ++ Seq(
    name := "codemirror",
    version := Versions.codeMirrorFacade
  )


  lazy val codeMirror = Project(id = "codemirror",base =  file("./codemirror"), settings = codeMirrorSettings )
    .enablePlugins(ScalaJSPlugin,BintrayPlugin)

  val facadesSettings:Seq[Setting[_]] = sameSettings ++   Seq(
    name := "facades",
    version := "0.14"
  )


  /**
   * Root project
   */
  lazy val facades  = Project(
    id   = "facades",
    base = file("."),
    settings = facadesSettings
    ).enablePlugins(ScalaJSPlugin).dependsOn(codeMirror,threejs).aggregate(codeMirror,threejs)


  override def rootProject = Some(facades)

}
