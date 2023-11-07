package lectures.oops

object Exceptions extends App {

  val x: String = null
  // println(x.length)   //thows exception

  // Throwing Exception
  //val aWierdValue: String = throw new NullPointerException

  //Throwable classes extends the throwable class
  //Exception and Error are the major throwable subtypes

  //Catch exception
  def getInt(withException: Boolean): Int =
    if(withException) throw new RuntimeException("No Int for you")
    else 42

  val potentialFail = try{
    //code that might throw
    getInt(true)
  }catch {
    case e: RuntimeException => println("caught a runtime exception")
  }finally {
    //Code that will execute no matter what
    //optional
    //does not influence the return type of this expression
    //use finally only for side effects
    println("finally")
  }
 // println(potentialFail)


  //Define your own Exception
  class MyException extends Exception
  val myException = new MyException
  throw myException
}
