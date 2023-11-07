package lectures.oops

object CaseClasses extends App {

  case class Person(name: String, age: Int)  //Promotes class param to fields
  val person = new Person("JIM", 26)
  println(person.name) // can be accessed as class field


  //Sensible toString() method
  // println(instance) = println(instance.toString) =>  Syntactic sugar
  println(person.toString)   // Person(JIM,26) , if case keyword is not used then prints lectures.oops.CaseClasses$Person@cb51256
  println(person)   // Person(JIM,26)

  //Equals and hashcode methods are implemented OOTB
  val person2 = new Person("JIM", 26)
  println(person == person2)  // True, if case keyword not used then false

  //have handy copy method
  val person3 = person2.copy()
  val person4 = person2.copy(age = 44)   //Keeps name same but updates age
  println(person3)    // Person(JIM,26)
  println(person4)    // Person(JIM, 44)

  //have companion objects
  val person5 = Person
  val person6 = Person("Alvin", 55)   // Calls apply() method of object, which inturn calls constructor

  // Are Serializable

  // Have extractor patterns = can be used in PATTERN MATCHING

  // Can be used for case objects

  case object unitedKingdom{
    def name: String = "this is UK"
  }

}
