
import java.util.Random;
class Str {
public static String PIN="1";
public static int i=-1;
public static char[] piN=new char[7];

static void run(){

 if(PIN!="")
  {   

  for(char c :PIN.toCharArray()){

 if(c!='*')
    { i++;
 piN[i]=c; }

}

    }
if(piN[0]=='1')
{
   System.out.print("\torange request "+PIN);
}

if(piN[0]=='2')
{
   System.out.print("\tmascom request "+PIN);
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
