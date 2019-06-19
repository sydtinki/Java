class q2{

static int[] numbs={1,2,2,1};

static int is121Array(int[] a){

boolean ok=true;
int idStart=0;
int idEnd=0;
int leftSum=0;
int rightSum=0;
int begin=a[0];
int end=a[a.length-1];

for(int i=0; i<a.length; i++){

if(a[i]<1 || a[i]>2 || begin!=1 || end!=1){

 return 0;

}

}

int add=0;
int sub=0;

 for(int j=0; j<a.length; j++){

if(add!=1){

leftSum+=a[j]; }

 if(a[j]!=begin){ add=1; idStart=j; sub=a[j]; break; }

}  leftSum-=sub;

int add1=0;
int sub1=0;

for(int k=a.length-1; k>0; k--){ 

 if(add1!=1){

 rightSum+=a[k]; }

 if(a[k]!=end){  add1=1; idEnd=k; sub1=a[k]; break; }

} rightSum-=sub1;  

for(int q=idStart; q<idEnd; q++){ 

 if(a[q]!=2){

 ok = false; 

}

}


if(ok==false || rightSum!=leftSum){

return 0;}


return 1; }

public static void main(String args[]) {

System.out.print(is121Array(numbs));

}

}