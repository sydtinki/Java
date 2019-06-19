class oddEven{

static int[] numbs={1,2,3,4,5,6,7};
static int result=0;

static int f(int[] a){

int Xtotal=0;
int Ytotal=0;

for(int i=0; i<a.length; i++){

 if(a[i]%2!=0){  // odd

 Xtotal+=a[i]; }

 else { // even

 Ytotal+=a[i];

 }

}   result=Xtotal-Ytotal;

return result; }

public static void main(String args[]){

System.out.print(f(numbs));

}

}