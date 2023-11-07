package lectures.functionalprogramming

object MapFlatMapFilter extends App {

  val list = List(1,2,3)
  println(list)           // List(1, 2, 3)
  println(list.head)      // 1
  println(list.tail)      // List(2, 3)

  //Map
  println(list.map(_ + 1))                  // List(2, 3, 4)
  println(list.map(_ + " is a number"))     // List(1 is a number, 2 is a number, 3 is a number)

  //Filter
  println(list.filter(_ % 2 == 0))     // List(2)

  //FlatMap
  val toPair = (x: Int) => List(x,x+1)
  println(list.flatMap(toPair))        // List(1, 2, 2, 3, 3, 4)

}
