import java.util.Scanner


object StringOper {
  
  
           def main(args:Array[String]){
             
             var sc = new Scanner(System.in)
             
             println("Enter the string")
             
             var str = sc.nextLine()
             
             println("Length of the string " + str.length())
             
             println("reverse of the string is " + str.reverse)
             
             var st = str.reverse.concat(str)
             
             println("conctenation of reverse and the required string is " + st)
             
             var arr = str.toCharArray()
             
             println(" String to character array")
             
             for(i<- 0 to str.length()-1 )
             {
               println(arr(i))
             }
             
            
             
             
             
             
             
           }
  
  
  
  
}