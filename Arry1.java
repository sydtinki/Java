class Arry1{

public static void main(String args[]){

 int ArrLen=0;

 for(int i=0; i<7; i++){

 ArrLen++;

}
  
  int[] numbs=new int[ArrLen];

for(int i=0; i<ArrLen; i++){

 numbs[i]=i;

}

System.out.print("Hello"+numbs[2]+" "+ArrLen);

}

}