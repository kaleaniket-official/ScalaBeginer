package lectures.functionalprogramming

object AnonymousFunctions extends App{

  val doubler = new Function1[Int, Int]{
    override def apply(x: Int): Int = x * 2
  }
  //Equivalent
  //Anonymous Function (LAMBDA)
  val doubler1 = (x: Int) => x * 2
  //OR
  val doubler3: Int => Int = x => x * 2    //Type inference

  //Multiple Param
  val adder:  (Int, Int) => Int = (a: Int, b: Int) =>  a + b

  // No  Param
  val doSomthing: () => Int = () => 3
  println(doSomthing)      // Prints function,  lectures.functionalprogramming.AnonymousFunctions$$$Lambda$18/0x00000008000ba040@76a3e297
  println(doSomthing())    // Actual call ,  Prints 3

  //Curly braces with Lambda
  var stringToInt = { (str: String) =>
    str.toInt
  }

  //MOAR syntactic sugar
  val incrementer: Int => Int = x => x + 1
  val incrementerEquivalent: Int => Int = _ + 1  // Equivalent to x => x + 1

  val adders:  (Int, Int) => Int = (a, b) => a + b
  val addersEquivalent:  (Int, Int) => Int = _ + _ // Equivalent to (a, b) => a + b

  //Curried Function with LAMBDA
  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(7))
}
