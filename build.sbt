name := "spark-statsd"

version := "2.4.3"

scalaVersion := "2.11.2"

libraryDependencies ++= {
  object V {
    val spark = "2.4.3"

  }

  Seq(
    "org.apache.spark" %% "spark-core" % V.spark % "provided"
  )
}

assemblyOutputPath in assembly := file(s"""./${artifact.value.name}-${version.value}.jar""")
