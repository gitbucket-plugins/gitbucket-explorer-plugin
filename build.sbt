organization := "io.github.gitbucket"
name := "gitbucket-explorer-plugin"
version := "6.0.0"
scalaVersion := "2.12.4"
gitbucketVersion := "4.23.1"

libraryDependencies ++= Seq(
  "javax.servlet"         % "javax.servlet-api" % "3.1.0" % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true
