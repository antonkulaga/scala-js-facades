scala-js-facades
===================

scalajs facades for some popular javascript libs.
Each javascript lib is a separate subproject and is published as separate artifact.

USAGE
-----

In order to resolve a lib you should add a resolver
```scala
resolvers += bintray.Opts.resolver.repo("denigma", "denigma-releases")
```

At the moment following libs are published for scalaJS-0.6

```scala
libraryDependencies += "org.scalajs" %%% "codemirror" % "5.2-0.4" //CodeMirror editor

libraryDependencies += "org.scalajs" %%% "threejs" % "0.0.71-0.1.4" //THREE.js lib
```


Getting Started
---------------
* to compile scala to javascript run:   sbt fastOptJS
* then package resources by: sbt package
* open /target/scala-2.11/classes/index.html in scala-js-facades project folder
* look at examples

NOTE: if you change anything (even resources files) you have to do sbt fastOptJS to see the changes
