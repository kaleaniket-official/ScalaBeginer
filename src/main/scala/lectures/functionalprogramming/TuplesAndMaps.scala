package lectures.functionalprogramming

object TuplesAndMaps extends App {

  //tuple = finlite ordered "Lists"
  val aTuple = new Tuple2(2, "Hello Scala") // Tuple2[Int, String] = (Int, String)
  //OR
  val aTuple1 = Tuple2(2, "Hello Scala") // Tuple2[Int, String] = (Int, String)
  //OR
  val aTuple2 = (2, "Hello Scala") // Tuple2[Int, String] = (Int, String)

  println(aTuple2._1) // 1 is 1st element ,  prints 2
  println(aTuple2.copy(_2 = "By Scala")) // (2,By Scala)
  println(aTuple2.swap)  // (Hello Scala,2)

  //Map - Keys->values
  val aMap: Map[String, Int] = Map()

  val phoneBook = Map(("Jim", 222),  "Daniel" -> 555) // a -> b is sugar for (a,b)
  println(phoneBook)  // Map(Jim -> 222, Daniel -> 555)

  //Map operations
  println(phoneBook.contains("Jim")) // true
  println(phoneBook("Jim"))  // 22
  //println(phoneBook("Mary")) // throws exception, to avoid add .withDefaultValue(-1)

  val phoneBook1 = Map(("Jim", 222),  "Daniel" -> 555).withDefaultValue(-1)
  println(phoneBook1("Mary")) // -1

  // Add a Pairing
  val aNewParining = "Mary" -> 777
  val newPhoneBook = phoneBook1 + aNewParining
  println(newPhoneBook)  // Map(Jim -> 222, Daniel -> 555, Mary -> 777)
}
