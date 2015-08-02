name := "native-packager-test"

scalaVersion := "2.11.7"

enablePlugins(JavaAppPackaging)

javaOptions in Universal += "-Dmy.file=conf/application.ini"

mainClass := Some("Main")
