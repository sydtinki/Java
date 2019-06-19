class ArryMethod4 {

 static char[] numbs = {99,99,98,98,97};

 static char[] a(){

 char ar[]= new char[3];

 int id=numbs.length-1;

 for(int i=0; i<ar.length; i++){ 

 ar[i]=numbs[id];
 id--;

 if(i==1){ id--; }

 }
 

return ar; }

public static void main(String args[]) {

 char[] values = a();

 for(int i=0; i<values.length; i++){

 System.out.print(values[i]);

}

}

}