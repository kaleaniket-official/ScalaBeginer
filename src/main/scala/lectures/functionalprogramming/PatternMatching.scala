package lectures.functionalprogramming

import scala.util.Random

object PatternMatching extends App {

  val random = new Random
  val x = random.nextInt(10)

  val desc = x match {
    case 1 =>  "the one"
    case 2 => "two"
    case 3 => "Three"
    case _ => "default" // _ = Wildcard
  }
  println(x) // 2
  println(desc) // two


  //1. Decompose Values
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 20)

  val greeting = bob match
    case Person(n, a) if a < 21 => s"Hi my name is $n and I cant drink in US"
    case Person(n, a) => s"Hi my name is $n and my age is $a"
    case _ => "I don't know who I am"

  println(greeting)  // Hi my name is Bob and I cant drink in US
}
