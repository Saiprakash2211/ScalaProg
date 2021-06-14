import  java.util._

object BooleanMatrix {
  
  def main(args:Array[String])
  {
    
    var  sc  = new Scanner(System.in)
    var r = sc.nextInt()
    var c = sc.nextInt()
    var arr =  Array.ofDim[Int](r,c)
    
    for(i<- 0 to r-1)
    {
      for(j<-0 to c-1)
      {
        arr(i)(j) = sc.nextInt()
      }
    }
    
    var row = new Array[Int](r)
    var col = new Array[Int](c)
    
    
    for(i<-0 to r-1)
    {
      for(j<-0 to c-1)
      {
        if(arr(i)(j)==1)
        {
          row(i)=1
          col(j)=1
          
        }
        
      }
    }
    
    for(i<-0 to r-1)
    {
      for(j<-0 to c-1)
      {
        if(row(i)==1)
        {
             arr(i)(j)=1
          
        }
        if(col(j)==1)
             arr(i)(j)=1
        
      }
    }
    
    
    println(" The Converted Matrix is here")
    for(i<-0 to r-1)
    {
      for(j<-0 to c-1)
      {
        print(arr(i)(j) + " ")
      }
      println("")
    }
    
  }
    
}