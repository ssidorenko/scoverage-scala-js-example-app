resolvers += Resolver.url("sbt-plugins",
    url("https://dl.bintray.com/ssidorenko/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.2")

addSbtPlugin("ch.sidorenko.scoverage" % "sbt-scoverage-scalajs" % "1.0.5-JS3")