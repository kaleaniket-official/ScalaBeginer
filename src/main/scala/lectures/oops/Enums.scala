package lectures.oops

object Enums {
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE
    //add fields/methods
    def openDocument(): Unit = {
      if(this == READ) println("Opening document..")
      else println("Reading not allowed")
    }
  }

  //constructor args
  enum PermissionWithBits(bits: Int){
    case READ extends PermissionWithBits(4) // 100
    case WRITE extends PermissionWithBits(2) // 010
    case EXECUTE extends PermissionWithBits(1) // 001
    case NONE extends PermissionWithBits(0) // 000
  }

  //Can have companion objects
  object PermissionWithBits{
    def fromBits(bits: Int) : PermissionWithBits = PermissionWithBits.NONE
  }

  def main(args: Array[String]): Unit = {
    val myPermission: Permissions = Permissions.READ
    myPermission.openDocument()

    //Standard API's
    println(myPermission.ordinal)  // Prints index of READ i.e 0
    val allPermissins = PermissionWithBits.values
    println(allPermissins) // Array of oll possible permissions

    val readPersmission  = Permissions.valueOf("READ") //  Permissions.READ


  }
}
