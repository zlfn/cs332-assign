name := "nodescala"
version := "1.0.0"
organization := "space.zlfn"

scalaVersion := "2.13.15"
scalacOptions ++= Seq("-Xasync")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "1.0.1"
