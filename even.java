class even{

public static int holdA,hold=0;

public static int[] numbs={1,2,3,4,5,6};

static int send(int n){ int odd=0;

 for(int i=0; i<numbs.length; i++){

 if(numbs[i]%n==0){

 odd=odd*10*1;

odd+=numbs[i];

 } 

 
if(numbs[i]%n!=0){

 holdA=holdA*10*1;

holdA+=numbs[i];

 }}
return odd;
 }


static int Numbs(){ 

 hold=numbs[0];

 for(int i=0; i<numbs.length-1; i++){ hold=hold*10*1;

hold+=numbs[i+1];


}

   return hold;  

 
}

public static void main(String args[]){

    System.out.print("For integers "+Numbs()+"\n");

   System.out.print("Even numbers are:"+send(2)+"\n");

      System.out.print("Odd numbers are:"+holdA+"\n");

}

}