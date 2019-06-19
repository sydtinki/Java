
class LowestNumb {
public static double count=-1;
public static double[] numbs={7,2,3,4,5};
public static double start=numbs[0];
public static double low=start;

static void Comp(double y){ count++;
  if(count==0){
low=y;
}
  if(y<low){
low=y;
}
}

public static String headLine(){
String msg="\tLooping through numbers to find the lowest\n";
return msg;
}

static void print(){
  printNumbs();
  System.out.println("\n\tLowest Number is: "+(int)low);
}

static void printNumbs(){
for(int i=0; i<numbs.length; i++){
System.out.println("\t"+(int)numbs[i]);
}
}

public static void main(String args[]) {

 for(int i=0; i<numbs.length; i++)
{
 if(start>numbs[i]){ Comp(numbs[i]); 
}
}
   System.out.println(headLine());
   print();
}
}
