package lectures.basics

object CBVvsCBN extends App {

  def callByValue(x: Long): Unit =
    println("Call by value "+ x)  // x is replaced by System.nanoTime() value
    println("Call by value "+ x)

  def callByName(x: => Long): Unit =
    println("Call by name " + x)   // x is replaced by System.nanoTime()
    println("Call by name " + x)    // x is replaced by System.nanoTime()

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
