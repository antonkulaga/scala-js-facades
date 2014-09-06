import bintray.Plugin._
import sbt.Keys._
import sbt._
import bintray.Opts
import bintray.Plugin.bintraySettings
import bintray.Keys._
import scala.scalajs.sbtplugin.ScalaJSPlugin._

object Build extends sbt.Build{



  publishMavenStyle := false


  val scalajsOutputDir = Def.settingKey[File]("directory for javascript files output by scalajs")

  protected val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug

  lazy val threejs = project.in( file("./threejs") )

  lazy val codeMirror = project.in( file("./codemirror") )

  lazy val interfaces = project.in( file(".") ) settings (

    //updateBrowsers <<= updateBrowsers.triggeredBy(ScalaJSKeys.fastOptJS in Compile),

    name := "interfaces"

    //bootSnippet := "Main().main();"

    ) dependsOn codeMirror dependsOn threejs

  /**
   * For parts of the project that we will not publish
   */
  lazy val noPublishSettings = Seq(
    publish := (),
    publishLocal := (),
    publishArtifact := false
  )


  val sameSettings:Seq[Setting[_]] = bintraySettings ++Seq(

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

    libraryDependencies +=  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"

  )



  val scalajsResolver: URLRepository = Resolver.url("scala-js-releases",
    url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(
      Resolver.ivyStylePatterns)


  lazy val publishSettings = Seq(
    repository in bintray := "denigma-releases",

    bintrayOrganization in bintray := Some("denigma"),

    licenses += ("MPL-2.0", url("http://opensource.org/licenses/MPL-2.0")),

    bintrayPublishIvyStyle := true
  )
}
