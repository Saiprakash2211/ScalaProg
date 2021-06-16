import java.lang.Exception._
import java.util._

class MyException(detail :Int) extends Exception{
  
        override def toString(): String = s"Exception is generated because number is $detail"

  
}

object UserDefinedException {
  
  
  def main(args:Array[String]){
    
    var sc = new Scanner(System.in)
    
    
    println("Enter the value less than 10")
    
    var a = sc.nextInt()
    
    if(a>10)
    {
      throw new MyException(a)
    }
    else
    {
      println("the value is "+ a)
    }
    
    
    
    
  }
  
}