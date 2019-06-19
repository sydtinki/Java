class LowestNumber{

static int[] numbs={2,3,2,4,0,6};

static int lowest(int[] a){

int len=a.length;
int start=a[0];
int low=start;

for(int i=0; i<len; i++){ 

if(a[i]<start){

 low=a[i];}

 }

return low;}

public static void main(String args[]) {

 for(int c=0; c<numbs.length; c++){

 System.out.print(numbs[c]+"\n"); }

 System.out.print("\nLowest Number: "+lowest(numbs));

}

}