package lectures.oops

object OOBasics extends App {

  val per = new Person("Aniket", 26)
  println(per.age + per.x)
  per.greet("Dan")
  per.greet()

}

class Person(name: String, val age: Int)//Contructor, Default params is also supported
 {
//Body
  val x = 2
  println(1 + 2)

  //Methods
  def greet(name: String): Unit = println(s"${this.name} says hi to $name")
  //overloading
  def greet(): Unit = println(s"helllo $name")

  //Multiple constructors or oveloaded constructors, limitation the value can be only another constructor
  def this(name: String) = this(name,0)
  def this() = this("johndoe")


}
/*
* Param and fields are differnt, here name is param, so cannot be accessed
by 'per', to convert constructornparam to fields, prefix val or var, so here
age can be accessed, also x can be accessed by per
* */
