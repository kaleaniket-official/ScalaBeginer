package lectures.functionalprogramming

object Sequences extends App {

  //Seq
  val aSequence = Seq(1,3,2,4)
  println(aSequence)          // List(1, 3, 2, 4)
  println(aSequence.reverse)  // List(4, 2, 3, 1)
  println(aSequence(2))       // 2 is index , so returns value 2
  println(aSequence ++ Seq(7,5,6)) // List(1, 3, 2, 4, 7, 5, 6)
  println(aSequence.sorted)      // List(1, 2, 3, 4)

  //Ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)  // Print 1 to 10 numbers

  //Lists
  val aList = List(1,2,3)
  val prepended = 42 +: aList :+ 32
  println(prepended)     // List(42, 1, 2, 3, 32)

  val apple5 = List.fill(5)("apple")
  println(apple5)     //List(apple, apple, apple, apple, apple)

  println(aList.mkString("-|-"))   // 1-|-2-|-3


  //Arrays
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[String](3) // dynamically allocated memory, default value is 0 or null
  threeElements.foreach(println) // null null null

  //Mutation
  numbers(2) = 0  // syntax sugar for numbers.update(2,0)
  println(numbers.mkString(" "))    // 1 2 0 4

  //Arrays and sequences
  val numberSeq: Seq[Int] = numbers   // Implicit Conversion
  println(numberSeq)   // ArraySeq(1, 2, 0, 4)

  //Vector
  val avector = Vector(1,2,3)
  println(avector) // Vector(1, 2, 3)
}
