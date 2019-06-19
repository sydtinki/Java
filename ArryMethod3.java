class ArryMethod3 {

 static char[] letters = {'q','c','f','b','a'};

 static char[] a(){

 char ar[]= new char[3];

 int id=letters.length-1;

 for(int i=0; i<ar.length; i++){ 

 ar[i]=letters[id];
 id--;

 if(i==1){ id--; }

 }
 

return ar; }

public static void main(String args[]) {

 char[] out = a();

 for(int i=0; i<out.length; i++){

 System.out.print(out[i]);

}

}

}