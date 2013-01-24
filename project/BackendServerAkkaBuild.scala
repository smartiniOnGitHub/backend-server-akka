import sbt._
import Keys._

object BackendServerAkkaBuild extends Build 
{
	val Organization = "backend_server_akka"
	val ArtifactName = "backend-server-akka"
	val Version      = "0.1"
	val ScalaVersion = "2.9.2"  // "2.10.0"
	val AkkaVersion  = "2.0.5"  // "2.1.0"

// TODO: set requirements to akka-2.1.0 and scala-2.10.0, and add all the rest inside this build file ...
// TODO: verify if set even Java 7 as requirement here ...

}
