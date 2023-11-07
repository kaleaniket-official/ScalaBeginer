package lectures.oops

object AnonymousClasses extends App {

  //Abstract class
  abstract class Animal {
    def eat: Unit
    def sjd: Unit
  }

  //Anonymous class
  val animal: Animal = new Animal:
    override def eat: Unit = println("hahahah")
    override def sjd: Unit = println("sdsdsd")

  println(animal.sjd)
}
