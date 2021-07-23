

trait Expr
{

def eval(e:Expr) : Int = e match {
	case Number(n) => n
	case Sum(e1,e2) => eval(e1) + eval(e2)
	}
}
case class Number(n:Int) extends Expr{
  
}
case class Sum(e1:Expr,e2:Expr) extends Expr{
}

case class Var(x:String) extends Expr
{
}
case class Product(e1:Expr,e2:Expr) extends Expr{
  
  
}

										
object Patt extends Expr{
  
  def main(args:Array[String]){
  println("Welcome to the Scala worksheet")
  
 
  var x = new Sum(new Number(1),new Number(2))
 
  var y = eval(x)
  println(y) 
  }
  
}