import sbt.Keys._
import sbt._
import bintray.Opts
import bintray.Plugin._
import bintray.Plugin.bintraySettings
import bintray.Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Build extends sbt.Build{


  lazy val sameSettings:Seq[Setting[_]] = bintraySettings  ++Seq(

    organization := "org.scalajs",

    scalaVersion := "2.11.5",

    resolvers += Resolver.sonatypeRepo("releases"),

    resolvers += Opts.resolver.repo("scalax", "scalax-releases"),

    resolvers += Opts.resolver.repo("alexander-myltsev", "maven"),

    // The Typesafe repository
    resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",

    resolvers +=  Resolver.url("scala-js-releases",
      url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(
        Resolver.ivyStylePatterns),

    scalacOptions ++= Seq( "-feature", "-language:_" ),

    libraryDependencies +=  "com.lihaoyi" %%% "scalatags" % "0.4.5"

  ) ++publishSettings


  lazy val scalajsResolver: URLRepository = Resolver.url("scala-js-releases",
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

  lazy val scalajsOutputDir = Def.settingKey[File]("directory for javascript files output by scalajs")

  protected lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug


  val threeJsSettings = sameSettings ++ publishSettings ++ Seq(
    name := "threejs",
    version := "0.0.68-0.1.4"
  )


  lazy val threejs = Project( id= "threejs", base =  file("./threejs"), settings = threeJsSettings )
    .enablePlugins(ScalaJSPlugin)

  val codeMirrorSettings = sameSettings ++ publishSettings ++ Seq(
    name := "codemirror",
    version := "4.8-0.4"
  )


  lazy val codeMirror = Project(id = "codemirror",base =  file("./codemirror"), settings = codeMirrorSettings )
    .enablePlugins(ScalaJSPlugin)

  val facadesSettings:Seq[Setting[_]] = sameSettings ++   Seq(
    name := "facades",
    version := "0.13"
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
