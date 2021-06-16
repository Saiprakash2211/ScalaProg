
import java.util._
object Palindrome {
  
  
  def main(args:Array[String]){
    
    
    var sc = new Scanner(System.in)
    
    var x = sc.nextLine()
    var y =x.reverse
    if(x==y)
      println("yes it is a palindrome")
    else
    {
      println("It is not a Palindrome")
    }
    
    
  }
  
}