sbtPlugin       := true

name            := "sbt-reflect"

organization    := "com.github.dragisak"

version         := "1.0.0"

scalaVersion    := "2.9.2"

//publishArtifact in (Compile, packageBin)	:= false

publishArtifact in (Compile, packageDoc)	:= false

publishArtifact in (Compile, packageSrc)	:= false

scalacOptions	++= Seq("-deprecation", "-unchecked")

publishTo := Some(Resolver.file("ticketfly.github.com", file(sys.env.get("TICKETFLY_HOME").getOrElse(Path.userHome) + "/ticketfly.github.com/repo")))

