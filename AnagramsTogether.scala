import java.util.Scanner
import java.util.StringTokenizer
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map
object AnagramsTogether {
  
  def main(args:Array[String]){
    
    var sc = new Scanner(System.in)
    
    println(" enter the strings giving spaces")
    
    var str = sc.nextLine()
    
    //println(str)
    
    var st1 = new StringTokenizer(str)
    
    //var arr = new Array[Char]()
    
    var  c =0
    
      while(st1.hasMoreTokens())
    {
       var d = st1.nextToken()
       c+=1
    }
    
     var arr = new Array[String](c)
    
    var i =0
    
    var st = new StringTokenizer(str)
    
    while(st.hasMoreTokens())
    {
      arr(i)=st.nextToken()
      i+=1
    }
     
    var map = scala.collection.mutable.Map[String,ListBuffer[String]]()
    
    
    for(i<- 0 to c-1)
    {
      
      var  s = arr(i)
      //println(s+" ")
      
      var c= s.toCharArray()
      
      var n = c.sorted
      
      
      var m = String.valueOf(n)
      //print(m)
      
      if(map.contains(m))
      {
        map(m).append(s)
      }
      else
      {
        var k = ListBuffer[String](s)
         map+=(m->k)
        
      }
      
      
    }
    
    var j = map.values
    for(i<- j)
    {
      println(i)
    }
    
    
    }
  
}