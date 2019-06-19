class qe3{

static int closestFibonacci(int n){

int[] fbs=new int[n];
int id=1; 

fbs[0]=1;
fbs[1]=1;

int start=fbs[0];
int high=start;

if(n<1){

return 0;

}

for(int p=1; p<n-2; p++){ id++; 

fbs[id]=fbs[id-1]+fbs[id-2];

}

for(int i=0; i<fbs.length; i++){ 

if(fbs[i]>start && fbs[i]<=n){ 

 high=fbs[i];}

 }

return high; }

public static void main(String args[]){

System.out.print(closestFibonacci(12));

}
}