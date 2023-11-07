package lectures.functionalprogramming

object WhatsAFunction extends App {

  //Use functions as first class element i.e we want to work with functions as we do with plain values

  //Function Types = Function[A,B]
  val stringToIntConverter = new Function1[String , Int] {
    override def apply(v1: String): Int = v1.toInt
  }
  println(stringToIntConverter("32"))

  // Function type Function[A, B, R] === (A, B) => R
  val adder: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
  //Syntactic sugar for above function
  val adder2: (Int, Int) => Int = (v1: Int, v2: Int) => v1 + v2

  //Curried Function
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int]{
      override def apply(y: Int): Int = x + y
    }
  }
  val adder3 = superAdder(3)
  println(adder3(4))   // Prints 7
  //OR
  println(superAdder(3)(4)) // Also returns 7 , Curried Function
}
