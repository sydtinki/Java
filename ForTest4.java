class ForTest4{

static int[] numbs={1,2,3,4,5};

static int numb(int x){

x++;
 return x; 


}

public static void main(String args[]){

 for(int i=0; i<numbs.length; i++){

 System.out.print(numb(i)); }

}

}