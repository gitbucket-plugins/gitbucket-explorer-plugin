organization := "io.github.gitbucket"
name := "gitbucket-explorer-plugin"
version := "6.1.0"
scalaVersion := "2.12.0"
gitbucketVersion := "4.26.0"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true
