class ArryX{

static int[] numbs={7,2,3,1,10,2};

public static void main(String args[]){

int id=0;
int j,i=0;

int left=numbs[i];
int right=numbs[numbs.length-1];

j=numbs.length-2;

for(i=1; i<numbs.length-2; i++){ 

 left+=numbs[i]; id=i;

 right+=numbs[j]; j--; id=j; 

 System.out.print(id);


}

}

}