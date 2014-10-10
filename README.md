scala-js-interfaces
===================

scalajs interfaces for some popular javascript libs.
Each javascript lib is a separate subproject and is published as separate artifact.

USAGE
-----

In order to resolve a lib you should add a resolver
```scala
resolvers += bintray.Opts.resolver.repo("denigma", "denigma-releases")
```

At the moment following libs are available

```scala
libraryDependencies += "org.scalajs" %%% "codemirror" % "4.5-0.1" //CodeMirror editor
```
```scala
libraryDependencies += "org.scalajs" %%% "threejs" % "0.0.68-0.1.1" //THREE.js lib
```

Getting Started
---------------
* to compile scala to javascript run:   sbt fastOptJS
* open /target/scala-2.11/classes/index.html in scala-js-interfaces project folder
* look at examples

NOTE: if you change anything (even resources files) you have to do sbt fastOptJS to see the changesublish
