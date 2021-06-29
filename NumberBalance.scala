import java.util.Scanner

object NumberBalance {
  
  
    def main(args:Array[String]){
      
      
      println("Enter the number ")
      
      var sc = new Scanner(System.in)
      
      var num = sc.nextLine()
      
      var k = num.toCharArray()
      
      var rhs = 0
      var lhs = 0

      for(i<- 0 to num.length()/2-1)
      {
        
        rhs = rhs + k(i)-'0'
        
       
      }
      for(i<-  num.length()/2 +1 to num.length()-1)
      {
        
        lhs = lhs + k(i)-'0'
        
       
      }
      
      if(lhs == rhs)
      {
        println("balanced")
      }
      else
      {
        println("not balanced")
      }
      
      
      
    }
  
  
  
}