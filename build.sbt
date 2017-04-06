name := "gitbucket-explorer-plugin"
organization := "io.github.gitbucket"
version := "3.0.0"
scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.github.gitbucket"  %% "gitbucket"         % "4.11.0"   % "provided",
  "javax.servlet"         % "javax.servlet-api" % "3.1.0" % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
useJCenter := true