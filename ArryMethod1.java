class ArryMethod1 {

 static int[] numbs = {2,3,4,5,6,11};

 static int[] a(){

 int ar[]= new int[2];

 ar[0]=numbs[(numbs.length-2)-3];
 ar[1]=numbs[3+1+2/2];

return ar; }

public static void main(String args[]) {

 int[] values = a();

 for(int i=0; i<values.length; i++){

 System.out.print(values[i]);

}

}

}