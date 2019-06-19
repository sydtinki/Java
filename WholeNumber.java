class WholeNumber {
 int value=0;

WholeNumber(){
}

WholeNumber(int y){
 value=y;
}
 int plus(int x){
   value+=x; return value;
}

void print(int x){
  System.out.println("\n\t"+x);
}
public static void main(String args[]) {
WholeNumber x=new WholeNumber(3);
int []numbers=new int[5];
int []Numbers=new int[5];

 for(int i=0; i<5; i++){
numbers[i]=i+1;
}

System.out.println("Number= " +x.value);
System.out.println("Plus 2= " +x.plus(2));

for(int i=0; i<5; i++){
WholeNumber u=new WholeNumber(numbers[i]); 

        System.out.println("\nNumber= " +numbers[i]);
        Numbers[i]=u.plus(2);
        System.out.println("Plus 2= " +Numbers[i]); 
}
  System.out.println("\n\tNumbers 1-5 plus 2 each:");

for(int i=0; i<5; i++){
  WholeNumber z=new WholeNumber(); 
  z.print(Numbers[i]); }
}
}