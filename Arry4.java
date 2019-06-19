class Arry4{

public static void main(String args[]){

int[] numbs = {1,2,3,4,5,6};

for(int i=0; i<numbs.length; i++){

 if(numbs[i]%2 !=0){

 numbs[i]=3; }

}

for(int j=0; j<numbs.length; j++){

System.out.print(numbs[j]);

}
}

}