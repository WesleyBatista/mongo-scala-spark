// You may use this file to add plugin dependencies for sbt.
resolvers += "Spark Packages repo" at "https://dl.bintray.com/spark-packages/maven/"

addSbtPlugin("org.spark-packages" %% "sbt-spark-package" % "0.2.6")
addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "0.14.5")
addSbtPlugin("com.github.saurfang" % "sbt-spark-submit" % "0.0.4")
