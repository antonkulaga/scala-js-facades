import sbt.Keys._
import sbt._
import bintray.Opts
import bintray.Plugin._
import bintray.Plugin.bintraySettings
import bintray.Keys._
import scala.scalajs.sbtplugin.ScalaJSPlugin._
// Turn this project into a Scala.js project by importing these settings
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import ScalaJSKeys._

object Build extends sbt.Build{


  lazy val sameSettings:Seq[Setting[_]] = bintraySettings ++ scalaJSSettings ++Seq(

    organization := "org.scalajs",

    scalaVersion := "2.11.2",

    resolvers += Opts.resolver.repo("scalax", "scalax-releases"),

    resolvers += Opts.resolver.repo("alexander-myltsev", "maven"),

    // The Typesafe repository
    resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",

    resolvers +=  Resolver.url("scala-js-releases",
      url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(
        Resolver.ivyStylePatterns),

    scalacOptions ++= Seq( "-feature", "-language:_" ),

    libraryDependencies +=  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6.1",
    libraryDependencies +=  "com.scalatags" %%% "scalatags" % "0.4.2"

  ) ++publishSettings

  publishMavenStyle := false


  val scalajsResolver: URLRepository = Resolver.url("scala-js-releases",
    url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(
      Resolver.ivyStylePatterns)


  lazy val publishSettings = Seq(
    repository in bintray := "denigma-releases",

    bintrayOrganization in bintray := Some("denigma"),

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

  val scalajsOutputDir = Def.settingKey[File]("directory for javascript files output by scalajs")

  protected val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug


  val threeJsSettings = sameSettings ++ publishSettings ++ Seq(
    name := "threejs",
    version := "0.0.68-0.1.2"
  )


  lazy val threejs = Project( id= "threejs", base =  file("./threejs"), settings = threeJsSettings )

  val codeMirrorSettings = sameSettings ++ publishSettings ++ Seq(
    name := "codemirror",
    version := "4.8-0.2"
  )


  lazy val codeMirror = Project(id = "codemirror",base =  file("./codemirror"), settings = codeMirrorSettings )

  val scrollerSettings = sameSettings ++ publishSettings ++ Seq(
    name := "scroller",
    version := "3.0.6-0.1"    
  )

  //malihu-custom-scrollbar-plugin
  lazy val scroller = Project(id = "scroller",base =  file("./scroller"), settings = scrollerSettings )

  val selectizeSettings:Seq[Setting[_]] = sameSettings ++   Seq(
    name := "selectize",
    version := "0.11.2-0.1"
  )

  //selectize.js
  lazy val selectize = Project(id = "selectize",base =  file("./selectize"), settings = selectizeSettings )

  val facadesSettings:Seq[Setting[_]] = sameSettings ++   Seq(
    name := "facades",
    version := "0.12"
  )


  /**
   * Root project
   */
  lazy val facades  = Project(
    id   = "facades",
    base = file("."),
    settings = facadesSettings
    ).dependsOn(codeMirror,threejs, scroller, selectize).aggregate(codeMirror,threejs, scroller, selectize)


  override def rootProject = Some(facades)

  resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

}
