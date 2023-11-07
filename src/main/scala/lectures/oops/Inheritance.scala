package lectures.oops

object Inheritance extends App {

  //supports Single class Inheritance i.e extents one class at a time
  class Animal {
    val creatureType: String = "Wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat


  //Constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //Overriding
  class  Dog extends Animal{
    override val creatureType: String = "Domentsic"
    override def eat: Unit = println("crunch")
  }
  val dog = new Dog
  dog.eat
  println(dog.creatureType)


  //Overriding in constructor
  class Mouse(override val creatureType: String) extends Animal {
    override def eat: Unit = println("bsbsb")
  }

  //type substitution (broad: Polymorphism)
  val unknownAnimal: Animal = new Mouse("Rodant")
  unknownAnimal.eat
}
