
class Case {
public static void main(String args[]) {
int i=0;

switch(i){
case 0:
  System.out.println(i);  ++i; break;
case 1:
  System.out.println(i); i++; break;
case 2:
  System.out.println(i); i++; break;
 default :
  System.out.println("");
  break;
}

if(i>0){
System.out.println("\nEnd of switch");
}
}
}
