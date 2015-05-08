resolvers +=  Resolver.url("scala-js-releases", url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("bintray-sbt-plugin-releases",url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "spray repo" at "http://repo.spray.io"

resolvers  += "Online Play Repository" at  "http://repo.typesafe.com/typesafe/simple/maven-releases/"

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.2")