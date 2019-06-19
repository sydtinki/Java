class errorHadling{

static int error=0;
static int[] numbs={1,3,1,2,1,1,1};

public static void main(String args[]){

for(int i=0; i<numbs.length; i++){

if(numbs[i]==1){}

else if(numbs[i]==2){}

else{

error++;

} }

System.out.print(error);

}

}