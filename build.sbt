name := "gitbucket-explorer-plugin"
organization := "io.github.gitbucket"
version := "1.0.3"
scalaVersion := "2.11.8"

resolvers ++= Seq(
  "bkromhout-maven" at "https://dl.bintray.com/bkromhout/maven/"
)

libraryDependencies ++= Seq(
  "io.github.gitbucket"  %% "gitbucket"         % "4.9.0"   % "provided",
  "javax.servlet"         % "javax.servlet-api" % "3.1.0" % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")