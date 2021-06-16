import java.util._

object RemoveDuplicate {
  
  
  def main(args:Array[String]){
    
    
    var sc = new Scanner(System.in)
    
    var c = sc.nextLine()

    var x = new Array[Char](c.length())
    for(i<-0 to c.length-1)
    {
      x(i)=c.charAt(i)
    }
    var arr = new Array[Int](26)
    
    for(i<- 0 to 25)
    {
      arr(i)=0
    }
    var j =0
    for(i<- 0 to x.length()-1)
    {
      if(arr(x(i)-'a')==0)
      {
        x(j)=x(i)
        j+=1
      }
      
      arr(x(i)-'a')=1
     }
    
    for(i<-0 to j-1)
    {
      print(x(i))
    }
    
    
    
  }
  
  
  }