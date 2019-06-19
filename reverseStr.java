class reverseStr{
 

public static String FirstReverse(String str) { 
  
    
     

String rt = str;
       
char[] chrs = rt.toCharArray();
       
rt="";
       
      

 for(int i=chrs.length-1; i>=0; i--){
           
          
 rt+=chrs[i];
      

 }
      
       
    
return rt;
    
  } 
  
 

 public static void main (String[] args) {  
   

   
    
String s = "Hello";
    

System.out.print(FirstReverse(s)); 
  }   
  
}





