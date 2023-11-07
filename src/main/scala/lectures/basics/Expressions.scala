package lectures.basics

object Expressions extends App {

  val x = 1 + 2 //Expressions
  println(x)

  println(2 + 3 * 5 )
  // + - * / & | ^ << >> >>> (right shift with extension)

  println( 1 == x)
  // == != < <= > >=

  println(!(1 == x))
  // ! && ||

  var a = 2
  a += 5 // also works with -= *= /=
  println(a)

  //Intructions(DO) vs Expressions(VALUE)

  //IF Expression
  val c = true
  val cValue = if(c) 5 else  3
  println(cValue)

  //Avoid using Loops in  SCala(i.e Imperative programming like JAVA) like While for etc
  // Everything in scala is Expression
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }

    //Type: unit
    val aWierdValue = (a = 4); // type is unit == void
    println(aWierdValue) // Prints ()

  //Code blocks
  // Code blocks are Expressions and it vaule and type is determined by last expression in code block

  val codeBlock = {
    val y = 4
    val z = y + 2

    if(z > y) "hello" else "good by"
  }
  println(codeBlock)

  // Differnce between "hello world" vs println("heloo world")

  val somvlaue = {
    2 < 3
  }
  println(somvlaue) // true

  val somOtherValue = {
    if(somvlaue) 239 else 432
    42
  }
  println(somOtherValue) // 42
}
