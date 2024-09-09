package recfun
import common._
import collection.mutable.HashMap

object Main {
  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal.exec(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  object pascal {
    val memoization = new HashMap[(Int, Int), (Int)]

    def exec(c: Int, r: Int): Int = {
      memoization.getOrElseUpdate((c, r), {
        (c, r) match {
          case (0, 0) => 1
          case (_, r) if r < 0 => throw new RuntimeException("r must be zero or positive")
          case (c, r) if c < 0 || c > r => 0
          case _ => exec(c, r-1) + exec(c-1, r-1)
        }
      })
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
