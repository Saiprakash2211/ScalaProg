import java.util.Random

trait Generate[T] {
     def generate():T
     def generator[T,U](
    
}
   
class integers extends Generate[Int]{
  
        val rand = new Random()
        def generate() = rand.nextInt()
       
        
     
}
class boolean extends Generate[Boolean]{
  
        val rand = new Random()
        var x = new integers()
        def generate() =  x.generate()>0
        
     
}

class pairs extends Generate[(Int,Int)]{
  
        val rand = new Random()
        var x = new integers()
        def generate() =  (x.generate(), x.generate())
        
     
}

      
object Generators {
                      
      def main(args:Array[String]){
        
        var x = new integers()
        println(x.generate())
        
        var y = new pairs()
        println(y.generate())
        
        var z = new boolean()
        println(z.generate())
       
       
        
        
           
      }
 
  
}