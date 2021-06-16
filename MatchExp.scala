import java.util._

object MatchExp {
  
  def main(args:Array[String]){
    
    var sc = new Scanner(System.in)
    
    println("Enter the currentMonth")
    
    var month = sc.nextLine()
    
    var quarter = month match{
        
        case "January"|"February"|"March" => "First Quarter"
        
        case "April"|"May"|"June" => "Second Quarter"
        
        case "July"|"August"|"September" =>"Third Quarter"
        
        case "October" |"November"|"Descember" =>"Fourth Quarter"
        
        case  _=> "Invalid Quarter"
        
    }
    
    println(month + " is" + quarter)
        
    
  }
  
}