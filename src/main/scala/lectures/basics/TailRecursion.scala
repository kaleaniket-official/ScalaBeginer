package lectures.basics

import scala.annotation.tailrec

object TailRecursion extends App {

  //Add recursive call at the end of code block
  def factorial(n: Int): BigInt = {
    @tailrec  //Annotation is optional, compiler error if used on recursive function
    def factHelper(x: Int, accumulator: BigInt) : BigInt = {
      if(x <= 1) accumulator
      else factHelper(x-1, x * accumulator)
    }
    factHelper(n,1)
  }
  println(factorial(10))

  //Exercise
  // 1. Concatenate string n times
  @tailrec
  def concatenate(aString: String, n: Int, accumulator: String): String =
    if(n <= 0) accumulator
    else concatenate(aString, n-1,aString + accumulator)

  println(concatenate("hello", 3, ""))

  // 2. isPrime tailrecursive
  def isPrime(n: Int): Boolean  =
    @tailrec
    def isPrimeTailRecursive(t: Int, isStillPrime: Boolean) : Boolean =
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailRecursive(t-1, n % t != 0 && isStillPrime)

    isPrimeTailRecursive(n/2,true)

  println(isPrime(2003))
  println(isPrime(629))

  // 3. Fibonacci
  def fibonacci(n: Int): Int = {
    def fiboTailRecursive(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboTailRecursive(i + 1, last + nextToLast, last)

    if(n <=2 ) 1
    else fiboTailRecursive(2,1,1)
  }

  println(fibonacci(8))
}
