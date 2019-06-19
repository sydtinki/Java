class sort{

public static int[] numbs={2,44,5,6,1,2,4,9};

static void swap(){

 for(int i=0; i<numbs.length-1; i++){

if(numbs[i+1]<numbs[i]){

  int a=numbs[i+1]; int b=numbs[i];

 numbs[i]=a; numbs[i+1]=b;
}

}

}

static void swaping(){

int c=0;

do{ c++;

swap();

}while(c<numbs.length);

}

public static void main(String args[]) {

swaping();

System.out.print(numbs[0]+" - "+numbs[7]);

}

}