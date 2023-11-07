package lectures.basics

object ValVarTypes extends App {

  //values
  val x: Int = 43;
  //x = 32
  // val is immutable, cannot change value
  val y = 21 // Compiler infers type to Val and Var

  //Variable
  var a: String = "HEllo"    // Semicolon are optional
  a = "Scala"  // Var are mutable

  //Basic types:
  var b: Boolean = false
  var c: Char = 'a'
  var i: Int = 33 // 4bytes
  var s: String = "acd"
  var sh: Short = 234 // 2 bytes
  var lon: Long = 23422424242424L // 8 bytes
  var fl:  Float = 2.0f
  var d: Double = 3.14



}
