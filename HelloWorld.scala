import java.util.Scanner;
object HelloWorld {
  
  // The program counts the number of zeroes in an Array.
  
  
  
  def main(args:Array[String]) {
    
   val sc = new Scanner(System.in);
   var x = sc.nextInt();
   var arr = new Array[Int](x);
   
   for(i : Int<- 0 to x-1) {
     arr(i) = sc.nextInt();
   }
   
   var c = CountZero(arr,x)
   
   println("Number of zeroes are " + c)
   
   }
  
  def CountZero(arr : Array[Int],n:Int):Int = {
    
    var count =0;
    for(i<-0 to n-1)
    {
      if(arr(i)==0)
        count=count+1
    }
    return count
    
    
  }
  
}