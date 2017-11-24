organization := "easy.taxi"
scalaVersion := "2.11.11"
version := "1.1.0"
name := "mongo-scala-spark"

spName := "organization/my-awesome-spark-package"
sparkVersion := "2.2.0"
sparkComponents ++= Seq("core", "mllib", "sql")
spDistDirectory := target.value

libraryDependencies ++= Seq(
 "com.github.samelamin" %% "spark-bigquery" % "0.2.2",
 "org.mongodb.spark" %% "mongo-spark-connector" % "2.2.1"  % "provided"
 )
