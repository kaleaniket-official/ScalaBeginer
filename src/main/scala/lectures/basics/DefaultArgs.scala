package lectures.basics

object DefaultArgs extends App {

  def factHelper(x: Int, accumulator: BigInt = 1): BigInt = {
    if (x <= 1) accumulator
    else factHelper(x - 1, x * accumulator)
  }
  val fact10 = factHelper(10)
  println(fact10)



  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving Picture")
  savePicture();

  /*
    1) Pass in evvery leating argument
             OR
   2) Name the Arguments
    */
  savePicture(width = 1290, format = "bmp", height = 180)

}
