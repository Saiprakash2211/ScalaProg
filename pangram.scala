import java.util._

object pangram {
  
  def main(args:Array[String])
  {
    
    var sc = new Scanner(System.in)
    var y = sc.nextLine()
    var x = y.toLowerCase()
    println(x)
    var n = x.length()
    var giv = new Array[Char](n)
    for(i<-0 to n-1)
    {
      giv(i)=x.charAt(i)
    }
    
    var arr = new Array[Int](26)
    for(i<-0 to 25)
    {
      arr(i)=0
    }
    for(i<-0 to n-1)
    {
     
      if(x.charAt(i)!=' ')
      {
         arr(x.charAt(i)-'a')=1
      }
    }
    var c =0
    for(i<-0 to 25)
    {
      if(arr(i)>=1)
        c+=1
    }
    if(c==26)
      println("It is anagram")
    else
      println("It is not an anagram")
      
    
   }
}