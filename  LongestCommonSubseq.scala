import java.util._

object  LongestCommonSubseq {
  
  def main(args:Array[String]){
    
    
    var sc = new Scanner(System.in)
    
    var x = sc.nextLine()
    var y = sc.nextLine()
    
    var m = x.length()
    var n = y.length()
   // println(m+" " +n)
    
    var length = Longest(x,y,m,n)
    
    println(" Length of Longest Common Subsequence is" + length);
    
  }
  
  def Longest(x:String,y:String,m:Int,n:Int): Int = 
  {
    
    if(m==0 |n==0)
    {
      return 0
    }
    if(x.charAt(m-1)==y.charAt(n-1))
     {
      var k = 1+Longest(x,y,m-1,n-1)
      return k
     }
    else
    {
      var i = Longest(x,y,m-1,n)
      var j =Longest(x,y,m,n-1)
      return i.max(j)
      
      
    }
      
   }
  
}