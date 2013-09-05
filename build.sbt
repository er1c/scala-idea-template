name := "scala-idea-template"

version := "1.0.0"

description := "Scala Project Template - developed primarily for reproducing IDEA bugs"

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

scalaVersion := "2.10.2"

// Use .target instead of target so it doesn't interfere with native sbt
EclipseKeys.eclipseOutput := Some(".target")

// Scala Test
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

//libraryDependencies  ++= Seq( 
//  "org.joda" % "joda-money" % "0.8",
//  "org.joda" % "joda-convert" % "1.2"
//)
