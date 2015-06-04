resolvers += Resolver.url("sbt-plugins",
    url("https://dl.bintray.com/ssidorenko/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.3")

addSbtPlugin("ch.sidorenko.scoverage" % "sbt-scoverage-scalajs" % "1.1.0-JS")