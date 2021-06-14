import java.util._

object SpiralTraverse {
  
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
    
    var row=0
    var col=0
    var pos=0 
    
    var output = Array[Int](r*c)
    
    while(row<r&&col<c)
    {
      
      for(i<-col to c-1)
      {
        output(pos) = arr(row)(i)
        print(output(i)+" ")
        pos = pos +1
      }
      
      row = row + 1
      
      for(i<- row to r-1)
      {
        output(pos) = arr(i)(c-1)
        print(output(i)+" ")
        pos = pos +1
      }
      
      c = c-1
      
      if(row<r)
        {
           var x = c-1
            for(i<- x to col by -1)
            {
                output(pos) = arr(r-1)(i)
                print(output(i)+" ")
                pos = pos +1
              
            }  
            
            r = r-1
            
        }
      
      if(col<c)
      {
          var x = r-1
           for(i<- x to row by -1)
           {
             output(pos) = arr(i)(col)
             print(output(i)+" ")
             
             pos= pos+1
             
             
          }
           col = col+1
             
        
        
      }
      
      
      
      
    }
    
    
   
    
    
   }
  
  
  
  
}