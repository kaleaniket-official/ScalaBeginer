package lectures.oops

object Generics {

  //Generic Classes
  class MyList[A]{
    //Use the type A
  }
  class MyMap[Key, Value]
  val myListInt = new MyList[Int]
  val myListString = new MyList[String]


  //Generic Methods
  object MyList {
    def empty[A]:  MyList[A] = ???
  }
  val myEmptyList = MyList.empty[Int]

  //Variance Problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //List[Cat] extents List[Animal] = Covariance = Yes
  class CovariantList[+A]   // +A indicates Covariance
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //Invariance = NO
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  //Contravariance
  class Trainer[-A]   // -A indicates Contravariance
  val trainer:  Trainer[Cat] = new Trainer[Animal]

  //Bounded type
  class Cage[A <: Animal](animal: A) // <: puts restriction on A to be sub-type of Animal class, >: puts restriction on A to be super-type of Animal class
  val cage = new Cage(new Dog)
}
