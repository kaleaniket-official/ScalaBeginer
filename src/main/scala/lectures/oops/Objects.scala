package lectures.oops

object Objects extends  App {

  //Scala does not have class level functionalities (i.e static)

  //Static like, with help of object
  object Person { //type + its only instance (singleton)
    //Class level functuonality
    val N_EYES = 2
    def canFly: Boolean  = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    //Instance level functionality
  }
//COMPANION , class and object with same name
  println(Person.N_EYES)
  println(Person.canFly)

  //In Scala we use object as a singleton instance
  val mary = Person
  val john = Person
  println(mary == john) // true

  val person1 = new Person("John")
  val person2 = new Person("mary")
  println(person1 == person2) // false

  //calling factory methods
  val bobbie = Person(person1,person2)  //not constructor, calls apply() method


  //Scala application = scala objects
  // def main(args: Array[String]): Unit

}
