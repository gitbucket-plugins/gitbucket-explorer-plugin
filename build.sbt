name := "gitbucket-explorer-plugin"
organization := "io.github.gitbucket"
version := "4.0.0"
scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "io.github.gitbucket"  %% "gitbucket"         % "4.16.0"   % "provided",
  "javax.servlet"         % "javax.servlet-api" % "3.1.0" % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
useJCenter := true
