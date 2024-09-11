package recfun
import common._
import collection.mutable.HashMap

object Main {
  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        //method + in class Int is deprecated (2.13.0)
        //print(pascal(col, row) + "")
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = (c, r) match {
    case (0, 0) => 1
    case _ if c < 0 || c > r => 0
    case _ => pascal(c, r-1) + pascal(c-1, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def recBalance(slice: List[Char], count: Int): Boolean = slice match {
      case _ if count < 0 => false
      case '(' :: slice => recBalance(slice, count + 1)
      case ')' :: slice => recBalance(slice, count - 1)
      case _ :: slice => recBalance(slice, count)
      case Nil => count == 0
    }
    recBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: Seq[Int]): Int = (money, coins) match {
    case _ if money < 0 => 0
    case (0, _) => 1
    case (_, Seq()) => 0
    case (_, coin :: tail) => countChange(money - coin, coins) + countChange(money, tail)
  }
}
