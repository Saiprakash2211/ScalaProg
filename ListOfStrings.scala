import scala.collection._

object ListOfStrings {
  
  
  def main(args:Array[String]){
    
    var x = List(" hi","Scalabale ","Language")
    
    //Accessing list elements
    
    println(x)
    
    for(i<- x)
    {
      println(i)
    }
    
    println(" reverse of list is " + x.reverse)
    
    
  }
  
}