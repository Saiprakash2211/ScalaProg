import java.util._;

object Rearrange {
  
  //The program rearranges the array with o(1) Extra Space
  
  def main(args:Array[String]){
    
    val sc= new Scanner(System.in);
    val x = sc.nextInt()
    var arr = new Array[Int](x);
    for(i<- 0 to x-1)
    {
      arr(i) = sc.nextInt()
    }
    
    Rearr(arr,x)
    for(i<- 0 to x-1)
    {
      print(arr(i) + " " )
    }
    
    
    
  }
  def Rearr(arr : Array[Int],x:Int)
  {
    for(i<- 0 to x-1)
    {
      arr(i)= arr(i)+ (arr(arr(i))%x*x);
    }
    for(i<- 0 to x-1)
    {
      arr(i)=arr(i)/x
    }
      
  }
  
}