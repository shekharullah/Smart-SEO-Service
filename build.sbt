name := "play-java"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
   "be.objectify" %% "deadbolt-java" % "2.3.3",
  "com.feth"      %% "play-authenticate" % "0.6.5-SNAPSHOT",
  "org.mongodb" % "mongo-java-driver" % "2.13.1",
  "org.mongodb.morphia" % "morphia" % "0.108",
  "org.mongodb.morphia" % "morphia-logging-slf4j" % "0.108",
  "org.mongodb.morphia" % "morphia-validation" % "0.108",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)     

resolvers ++= Seq(
  "Apache" at "http://repo1.maven.org/maven2/",
  "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
  "play-easymail (release)" at "http://joscha.github.io/play-easymail/repo/releases/",
  "play-easymail (snapshot)" at "http://joscha.github.io/play-easymail/repo/snapshots/",
 Resolver.url("Objectify Play Repository", url("http://deadbolt.ws/releases/"))(Resolver.ivyStylePatterns),
  "play-authenticate (release)" at "http://joscha.github.io/play-authenticate/repo/releases/",
  "play-authenticate (snapshot)" at "http://joscha.github.io/play-authenticate/repo/snapshots/"
)



