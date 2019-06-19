class ArrySum{

static int[] numbs={1,2,3,4,5,6,5};

static int a(int[] a){

int len=a.length;
int midIdx=len/2;
int midItem=a[midIdx];

int i,total=0;

 if(len%2==0){

return 0;

}

for(i=0; i<len; i++){

if(i!=midIdx && a[i]!=midItem){

 total+=a[i];

}

}

return total; }

public static void main(String args[]){

 System.out.print(a(numbs));

}

}