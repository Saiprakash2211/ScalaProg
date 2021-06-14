import java.util._

object KthSmallest {
  def main(args:Array[String]){
    
    var sc = new Scanner(System.in)
    println(" enter the sizeof array")
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    println("enter the elements")
    for(i<-0 to n-1)
    {
      arr(i)=sc.nextInt()
    }
    
    println("enter the value of k")
    var k = sc.nextInt()
    scala.util.Sorting.quickSort(arr)
    
    println(" the "+ k +" th smallest element is " + arr(k-1))
    
    
    
  }
}