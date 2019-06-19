public class duplicate1 {
    
    
// print only 1 number without its duplicate

static 

int[] numbs = {1,1,4,4,1};

static int total =0,idx=-1, count=0,id=-1;


 
   
 public static void main(String []args){
 int[] copy= new int[numbs.length];
         
        
 for(int x=0; x<numbs.length; x++){
            
 total+=numbs[x]; copy[x]=numbs[x];     
 }
        
       
 do{ idx++; int srch=copy[idx];
 
       
        
 for(int i=0; i<copy.length; i++){
 
            
if(i !=idx && copy[i]==srch){
  
             
  copy[i]=total;
             }
   
      }
         
   } while(idx<copy.length-1);
  
          
          
   for(int p=0; p<copy.length; p++){
         
        
 if(copy[p]!=total){
            
 count++;
       
  }
     
        } 
   
          
int[] hold = new int[count];
 
int[] times = new int[count];
 
         
for(int k=0; k<copy.length; k++){

      
if(copy[k]!=total){
            
 id++; hold[id]=copy[k];
  int count=0, look=hold[id];
   
  
   
 for(int q=0; q<numbs.length; q++){

 if(numbs[q]==look){ count++; } times[id]=count;
 
    }
   } }         
 System.out.print(hold[0]+" appears times "+times[0]);
    
 }
}