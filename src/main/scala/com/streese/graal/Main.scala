package com.streese.graal

import org.graalvm.polyglot._

object Main extends App {
  val context = Context.newBuilder().allowAllAccess(true).build()
  val func    = context.eval("js", "x => x.age()")
  val person  = Person("Max", 27)
  val age     = func.execute(person).asInt()
  println(age)
}
