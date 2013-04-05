import sbt._
import Keys._

object BackendServerAkkaBuild extends Build 
{
	val Organization = "backend_server_akka"
	val ArtifactName = "backend-server-akka"
	val Version      = "0.1"
	val ScalaVersion = "2.10.1"
	val AkkaVersion  = "2.1.2"

// TODO: update other requirements for the chosen scala and akka versions ...
// TODO: verify if set even Java 7 as requirement here ...

}
