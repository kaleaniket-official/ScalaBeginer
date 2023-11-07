package lectures.functionalprogramming

object HOFsCurries extends App {

  //Higher Order Functions and Curries
  val superFunction: (Int , (String, (Int => Boolean)) => Int) => (Int => Int) = null


  //Curried function with multiple parameter list
  def curriedFormater(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormater("%4.2f")
  val preciseFormat: (Double => String) = curriedFormater("%10.8f")

  println(standardFormat(Math.PI))  // 3.14
  println(preciseFormat(Math.PI))   // 3.14159265


}

