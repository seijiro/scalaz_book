
object Excercise1{
  def fib(n: Int) = {
    @annotation.tailrec
    def go(n: Int, prev: Int, current: Int): Int =
      if(n == 0) prev
      else go(n-1, current, prev + current)

      go(n, 0, 1)
    }

    def main(args: Array[String]): Unit = {
      if(fib(6) == 8) println("correct")
      else println("incorrect")
    }

  }
