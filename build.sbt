organization := "io.github.gitbucket"
name := "gitbucket-explorer-plugin"
version := "7.0.0"
scalaVersion := "2.13.0"
gitbucketVersion := "4.32.0"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true
