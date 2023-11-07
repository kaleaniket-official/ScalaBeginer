package lectures.oops
import scala.language.postfixOps

object MethodNotations extends App{

  class Person(val name: String, favMovie: String){
    def likes(movie: String): Boolean = movie == favMovie
    def hangOutWith(person: Person): String = s"${this.name} hangout with ${person.name}"
    def +(person: Person): String = s"${this.name} hangout with ${person.name}"
    def unary_! : String = s"$name what the heck!"
    def isAlive: Boolean = true
    def apply(): String = s"$name like $favMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  //infix notation = operator notation - >  works with methods with only one parameter

  //operator in Scala
  val tom = new Person("tom", "fight club")
  println(mary hangOutWith tom)
  println(mary + tom)

  //All Operators ar methods
  println(1 + 2)
  println(1.+(2))

  //Prefix notation (for unary operators)
  val x = -1
  val y = 1.unary_- //equivalent
  //unary_ only works with + - ! ~

  println(!mary)
  println(mary.unary_!)


  //Postfix notation (function without parameters)
  println(mary.isAlive)
  println(mary isAlive)

  //default apply() method
  println(mary.apply())
  println(mary()) // equivalent, looks for method apply with 0 params


}
