This project showcases how one can combine the [GraalVM Polyglot API](https://www.graalvm.org/docs/reference-manual/polyglot/)
with [GraalVM Native Image](https://www.graalvm.org/docs/reference-manual/native-image/) in Scala.

To build the binary you have to have the [GraalVM Native Image Generator utility](https://www.graalvm.org/docs/reference-manual/native-image/#install-native-image)
as well as [sbt](https://www.scala-sbt.org/1.x/docs/Setup.html) installed.

Once you have both in place simply run `sbt graalvm-native-image:packageBin`
and the binary should get created.
