name := "graal"
organization := "com.streese"

version := "0.0.0"
scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.graalvm.sdk" % "graal-sdk" % "20.1.0"
)

enablePlugins(GraalVMNativeImagePlugin)

graalVMNativeImageOptions ++= {
  val reflectionFile = Keys.sourceDirectory.in(Compile).value./("graal")./("reflection.json")
  assert(reflectionFile.exists)
  Seq(
    s"-H:ReflectionConfigurationFiles=$reflectionFile",
    "-H:+ReportExceptionStackTraces",
    "--initialize-at-build-time",
    "--language:js",
    "--no-fallback"
  )
}
