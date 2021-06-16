import scala.collection._

object ListCollection {
  
  def main(args:Array[String]){
    
      var x = List[Int](1,2,3,4,4,5,5,5,67,7)
      
      println("the list given is " + x)
      
      var y = x.reverse
      
      println("the reverse of given list is "+ y)
      
      print("the concatenation of above two lists is")
      var z = List.concat(x,y)
      
      println(z)
      
      
      }
  
}