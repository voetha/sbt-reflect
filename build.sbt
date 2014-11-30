sbtPlugin       := true

name            := "sbt-reflect"

organization    := "com.github.avoeth"

version         := "1.1.1"

scalaVersion    := "2.10.3"

//publishArtifact in (Compile, packageBin)	:= false

publishArtifact in (Compile, packageDoc)	:= false

publishArtifact in (Compile, packageSrc)	:= false

scalacOptions	++= Seq("-deprecation", "-unchecked")
