class ArryMethod2 {

 static char[] letters = {'q','c','f','b','a'};

 static int[] a(){

 int ar[]= new int[3];

 int id=letters.length-1;

 for(int i=0; i<ar.length; i++){ 

 ar[i]=letters[id];
 id--;

 if(i==1){ id--; }

 }
 

return ar; }

public static void main(String args[]) {

 int[] values = a();

 for(int i=0; i<values.length; i++){

 System.out.print(values[i]);

}

}

}