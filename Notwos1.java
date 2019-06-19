class Notwos1{

static int[] numbs={1,1,2,1,1};
static int notwos=0;

static int count(){

for(int i=0; i<numbs.length; i++){

 if(numbs[i]==2){

 notwos++;

}

}

return notwos;}

public static void main(String args[]){

int numb = count();

 System.out.print(numb);

}

}
