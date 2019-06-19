class sort1{

static int[] numbs={2,3,1,4,0};

static int[] sorted(int[] a){

int total=0;
int i=0;
int id=-1;
int flag=-1;
int count=0;
int[] sortedNumbs=new int[a.length];

for(int j=0; j<a.length; j++){

 total+=a[j];

} 

int lowest=total; 

for(i=0; i<a.length; i++){ id++; count++;

 if(a[i]<lowest){ 

 lowest=a[i]; flag=i;

 } 

if(count==0){

 sortedNumbs[id]=lowest; }

if(count>0 && i!=flag){

sortedNumbs[id]=lowest;  }

} 

return sortedNumbs;}


public static void main(String args[]) {

int[] ar = sorted(numbs);

System.out.print(ar[1]);
}

}