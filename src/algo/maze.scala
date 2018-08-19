package algo

object maze {
  def main(Args: Array[String]) {
    println("Enter the number of rows:")
    var rows = scala.io.StdIn.readInt()
    println("Enter the number of coloums:")
    var coloumns = scala.io.StdIn.readInt()
    var myarray = Array.ofDim[Int](rows, coloumns)
    var sol = Array.ofDim[Int](rows, coloumns)
    println("enter the matrix data")
    for (i <- 0 to rows - 1) {
      for (j <- 0 to coloumns - 1) {
        myarray(i)(j) = scala.io.StdIn.readInt()
      }
    }
    println("Your matrix data is:")
    for (i <- 0 to rows - 1) {
      for (j <- 0 to coloumns - 1) {
        print(myarray(i)(j) + "\t")
      }
      println("")
    }
    def printsol(sol:Array[Array[Int]], rows:Int, coloumns:Int){
    println("Maze generation will be:")
    for (i <- 0 to rows - 1) {
      for (j <- 0 to coloumns - 1) {
        print(sol(i)(j) + "\t")
      }
      println("")
    }
    
    def solution(x: Int, y: Int, sol: Array[Array[Int]]): Boolean = {
      var sol = Array.ofDim[Int](rows, coloumns)

      if (x == rows - 1 && y == coloumns - 1) {
        sol(x)(y) == 0
        return true
      }
      return false

      def isPossible(myarray: Int, x: Int, y: Int): Boolean = {

        if (isPossible(myarray, x, y) == true)
          sol(x)(y) == 0
        if (solution(x + 1, y + 0, sol) == true)
          return true
        if (solution(x + 0, y + 1, sol) == true)
          return true
        if (solution(x - 1, y + 0, sol) == true)
          return true
        if (solution(x + 0, y - 1, sol) == true)
          return true
        sol(x)(y) == 1
        return false
      }
      return false
      if (solution(0, 0, sol) == false) {
        print("Solution doesn't exist")
        return false
      } else (solution(0, 0, sol) == true)
      return true
    
    }
    //(x + 1, y + 0)
    //(x + 0, y + 1)
    //(x - 1, y + 0)
    //(x + 0, y - 1)

  }
}   

}

