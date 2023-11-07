package lectures.oops

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal{
    val creatureType:  String
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Domestic"
    def eat: Unit = println("crunch")   // override keyword is optional
  }

  //Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded{
    val creatureType: String = "croc"
    def eat: Unit = println("nomnom")
    def eat(animal: Animal): Unit = println(s"croc is eating ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog)
}
