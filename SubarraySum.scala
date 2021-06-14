import java.util._

object SubarraySum {
  
  // The following program finds the maximum subarray sum
  // This is Kadanes algorithm.
  
  
  def main(args:Array[String]){
    
    
    val sc= new Scanner(System.in);
    val x = sc.nextInt()
    var arr = new Array[Int](x);
    for(i<- 0 to x-1)
    {
      arr(i) = sc.nextInt()
    }
    
    var maxsubarraySum = SubArraySum(arr,x)
    
    println("The maximum subarray sum is " + maxsubarraySum)
    
    
    
    
  }
  def SubArraySum(arr : Array[Int],x:Int):Int= {
    
    var maxsof =0 
    var  maxf :Int = Int.MinValue
    
    for(i<-0 to x-1)
    {
      maxsof += arr(i)
      maxf = maxsof.max(maxf)
      
      if(maxsof<0) maxsof = 0
      
      
    }
    
    
    return maxf
    
    
    
  }
  
  
  
}
