

  
object TransList {
  
  
  
  
  def main(args:Array[String]){
    
    def Trans(xs:List[Int],y:Int):List[Int]={
    
    xs match {
    case Nil=> xs
    case(x::xs1)=>(x*y)::Trans(xs1,y)
        
    }
    
  }
    var ls = Trans(List(-44, -4, 1, 4, 5, 7, 8, 22),8)
    println(ls)
    
    
  }
  
  
  
  
  
}