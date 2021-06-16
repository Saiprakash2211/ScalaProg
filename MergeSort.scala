import java.util._

object MergeSort {
  
     def main(args:Array[String]){
       
        var sc = new Scanner(System.in)
        println("Enter the Size of the Array")
        var n = sc.nextInt()
        
        var arr = new Array[Int](n)
        println(" Enter the elements if the array")
        for(i<- 0 to n-1)
        {
          arr(i)= sc.nextInt()
         
        }
        
        MergeSt(arr,0,n-1)
        
        for(i<- 0 to n-1)
        {
         print(arr(i)+" ")
         
        }
        
      }
     
     def Merge(arr:Array[Int],l:Int,m:Int,r:Int)
     {
       var n1= m-l+1
       var n2 =  r -m;
       
       var L =  new  Array[Int](n1)
       var R =  new  Array[Int](n2)
       
       for(i<- 0 to n1-1)
       {
         L(i)=arr(l+i)
       }
       for(j<-0 to n2-1)
       {
         R(j) =arr(m+1+j)
       }
       
       var i=0
       var j=0
       var k=l
       
       while(i<n1 && j<n2)
       {
         if(L(i)<=R(j))
         {
           arr(k)=L(i)
           i+=1
         }
         else
         {
           arr(k)=R(j)
           j+=1
         }
         k+=1
         
       }
       
       while(i<n1)
       {
         arr(k)=L(i)
         i+=1
         k+=1
       }
       
       while(j<n2)
       {
         arr(k)=R(j)
         j+=1
         k+=1
       }
       
       
    }
     
     
    def MergeSt(arr:Array[Int],l:Int,r:Int){
      
      if(l>=r)
        return
        
      
      
        var m = l+(r-l)/2
        
        MergeSt(arr,l,m)
        MergeSt(arr,m+1,r)
        Merge(arr,l,m,r)
        
       
      
    }
     
     
  
  
  
}