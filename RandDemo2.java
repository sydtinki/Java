
import java.util.Random;
class RandDemo2 {
public static String PIN="a";
public static Boolean found=false;

static void run(){

 if(PIN!="")
  {
for(char c :PIN.toCharArray()){ 

 switch(c){
 case 'a':
       found=true;
       System.out.println("orange request "+PIN); break;
 case 'b':
       found=true;
       System.out.println("mascom request"); break;

         }

} 
  if(!found){
  System.out.println("invalid code");
            }
} 
}


public static void main(String args[]) {
Random r = new Random();
int val;

for(int i=0; i<6; i++){
    val=r.nextInt(9);
    PIN+=val;   
}run();
}
}
