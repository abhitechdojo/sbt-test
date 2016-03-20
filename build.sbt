name := "MyFoo"

organization := "MyOrg"

version := "1.0.0"

scalaVersion := "2.10.4"

val sparkVersion = "1.6.1"

val provided = "provided"

val gitHeadCommitSha = taskKey[String] ( "Determines the current git commit sha")

gitHeadCommitSha := Process("git rev-parse HEAD").lines.head

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % provided,
    "org.apache.spark" %% "spark-sql" % sparkVersion % provided
)

