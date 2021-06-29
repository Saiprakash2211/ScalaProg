import java.util.Scanner

object FunctCurry {
  
  
  def main(args:Array[String]){
    
    def f(x:Int)=x*x
    def sum1(f:Int=>Int,a:Int,b:Int):Int={
      
       if(a>b)          //base condition
       {
         0
       }
       else
       {
        return f(a) + sum1(f,a+1,b)
         
       }
      
    }
    println(sum1(f,10,20))  
    
    println(sum1(x=>x*99,10,20))  //Passing Anonymous Functions
    
    //Function Currying Examples
    
    def sum2(f:Int=>Int):(Int,Int)=>Int ={
      
      def SumF(a:Int,b:Int):Int={
        if(a>b)
          return 0
        else
          return f(a) + SumF(a+1,b)
        
      }
      SumF
      
    }
    
    var  sumInt = sum2(x=>x)   // take it as point 1
    
    println("Enter the Range")
    
    var sc = new Scanner(System.in)
    
    
    
    println(sumInt(sc.nextInt(),sc.nextInt()))
    
    
    
    
    
}
  
}