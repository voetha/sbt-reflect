sbtPlugin       := true

name            := "sbt-reflect"

organization    := "com.github.dragisak"

version         := "1.0.0"

scalaVersion    := "2.9.2"

//publishArtifact in (Compile, packageBin)	:= false

publishArtifact in (Compile, packageDoc)	:= false

publishArtifact in (Compile, packageSrc)	:= false

scalacOptions	++= Seq("-deprecation", "-unchecked")
