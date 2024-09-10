package recfun
import common._
import collection.mutable.HashMap

object Main {
  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println()

    println("Parenthesis Balancing")
    println(balance("(TEST)".toList))
    println(balance("(TEST))".toList))
    println()


  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = (c, r) match {
    case (0, 0) => 1
    case (c, r) if c < 0 || c > r => 0
    case _ => pascal(c, r-1) + pascal(c-1, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def recBalance(slice: List[Char], count: Int): Boolean = {
      if (count < 0) { return false }
      slice match {
        case '('+:slice => recBalance(slice, count + 1)
        case ')'+:slice => recBalance(slice, count - 1)
        case _+:slice => recBalance(slice, count)
        case _ => count == 0
      }
    }
    recBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) return 0
    (money, coins) match {
      case (0, _) => 1
      case (_, coin+:tail) => countChange(money - coin, coins) + countChange(money, tail)
      case _ => 0
    }
  }
}
