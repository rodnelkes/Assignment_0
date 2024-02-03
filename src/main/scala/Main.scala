object Main {
  private def addFive(a: Int): Int = {
    a + 5
  }

  private def checkNumber(dict: Map[Int, String], i: Int): String = {
    i match {
      case 0 => dict(0)
      case 5 => "five"
      case 6 => dict(6)
      case 23 => "twenty three"
      case 27 => dict(27)
      case _ => "don't know!"
    }
  }

  def main(args: Array[String]): Unit = {
    val myNum: Int = 6
    var sum: Int = 0

    println(s"Starting value: $myNum")

    sum = addFive(myNum)
    println(s"Sum: $sum")

    val myNums: List[Int] = List(myNum, sum, 23)
    println(s"Adding five to the sum of my numbers: ${addFive(myNums.sum)}")

    val myDict: Map[Int, String] = Map(0 -> "zero", 6 -> "six", 27 -> "twenty seven")

    println(s"My dictionary: ${myDict(0)}")
    println(s"My dictionary: ${myDict(27)}")
    println(s"My dictionary: ${myDict(27 - 21)}")

    // bad code but tests the pattern matching functionality of checkNumber
    val sawSix: Boolean = checkNumber(myDict, 6) == "six"
    if (sawSix) println(s"${myDict(6)}") else println(s"Where is my six?")

    val quotient: Double = 27.0 / 6.0
    println(s"${myDict(27)} / ${myDict(6)} = $quotient")
  }
}
