name := "gitbucket-explorer-plugin"
organization := "io.github.gitbucket"
version := "3.1.0"
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "io.github.gitbucket"  %% "gitbucket"         % "4.12.1"   % "provided",
  "javax.servlet"         % "javax.servlet-api" % "3.1.0" % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
useJCenter := true