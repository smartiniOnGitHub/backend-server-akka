import sbt._
import Keys._

object BackendServerAkkaBuild extends Build 
{
	val Organization = "backend_server_akka"
	val ArtifactName = "backend-server-akka"
	val MainPackage  = "bsa"  // the base package for this project, here just as info
	val Version      = "0.1"
	val ScalaVersion = "2.10.5"
	val AkkaVersion  = "2.2.5"

// TODO: update other requirements for the chosen scala and akka versions ...
// TODO: verify if set even Java 7 as requirement here ...

}
