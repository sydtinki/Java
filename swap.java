class swap{

static int[] numbs={1,2,3,4,5,6};
static int first=numbs[0];

static int temp,hold,idx=0;

static void receive(int[] x){ 

 int len=x.length;

 for(int z=0; z<len; z++){ 

 System.out.print(x[z]);

}
 System.out.print("\n");
}

public static void main(String args[]){

 for(int i=0; i<numbs.length; i++){

     System.out.print(numbs[i]);

} System.out.print("\nSWAP NUMBERS\n");

 for(int x=0; x<numbs.length; x++){  hold=numbs[x]; 

 if(x==0){ numbs[x]=first; }

 if(x==1){  numbs[0]=hold; numbs[x]=first;  }

 if(x>=2){  numbs[0]=hold;  numbs[x]=first; idx=x-1;

 
  if(temp!=0){

 numbs[idx]=temp; } } temp=hold;

   
receive(numbs);
}

} //end main

}