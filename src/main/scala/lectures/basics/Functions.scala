package lectures.basics

object Functions extends App {

  def aFuntion (a: String, b: Int) : String = {
    a + " " + b
  }
  println(aFuntion("Hello", 5))

  //Parameterless fucntion , can be just called by name
  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())
  //println(aParameterlessFunction)

  // Repeated/Recursive function
  // When u need loops , use recursion
  // Recursive function need return type, while compile infers return type for non-recursive functions

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))

  def afunctionWithSideEffects(aString: String) : Unit = println(aString)
  println(afunctionWithSideEffects("Hello")) // prints ()

  //Auxilery functions
  def aBiggerFunction(n: Int): Int = {
    def aSmallerFunction(a:Int,b:Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
  println(aBiggerFunction(5)) // 9

  //Exersise
  // 1. Greeting function
  def greetFuntion(name: String, age: Int): String =
    "Hi my name is "+ name + " and I am "+ age + " years old."

  println(greetFuntion("Aniket", 31))

  //2. Factorial function
  def factorial(n: Int): Int = {
    if(n == 1) n
    else  n * factorial(n - 1)
  }
  println(factorial(3))

}
