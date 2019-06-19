
import java.util.Random;
class RandDemo1 {
public static String PIN="c";
public static Boolean found=false;

static void run(){

 if(PIN!="")
  {
for(char c :PIN.toCharArray()){
 if(c=='a')
    { found=true;
 System.out.println("orange request");}

  if(c=='b')
     { found=true;
   System.out.println("mascom request");}

  if(c=='c')
     { found=true;
  System.out.println("btc request");}}
    }

if(!found){ 
  System.out.println("xxx"); }
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
