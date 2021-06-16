

object ListsDemo2 {
   def main(args:Array[String]){  
        var list = List(1,8,5,6,9,58,23,15,4)  
        var list2 = List(88,100)  
        print("Elements: ")  
        list.foreach((element:Int) => print(element+" "))         
        print("\nElement at 2 index: "+list(2))              
        var list3 = list ++ list2                               
        print("\nElement after merging list and list2: ")  
        list3.foreach((element:Int)=>print(element+" "))      
        var list4 = list3.sorted                             
        print("\nElement after sorting list3: ")  
        list4.foreach((element:Int)=>print(element+" "))    
        var list5 = list3.reverse                            
        print("\nElements in reverse order of list5: ")  
        list5.foreach((element:Int)=>print(element+" "))    
  
    }  

}