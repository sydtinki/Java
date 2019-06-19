class common{

public static int[] numb={21,4,6,7,9,1};
public static int[] numb1={2,4,6,8,3,3,2,3};
public static int id=-1;
public static int count=0;

static int getHighest(int x, int y){ int send=0;

 if(x>y){ send=x; }

 if(y>x){ send=y; }

 if(y==x){ send=x; }

 return send;

}

static int getLowest(int x, int y){ int send=0;

 if(x<y){ send=x; }

 if(y<x){ send=y; }

 if(y==x){ send=x; }

 return send;

}

static int[] f(int[] a, int[] b){ 

  int len=0;
  int size=a.length; 
  int size1=b.length;

int[] a1= new int[size*2],a2 =new int[size*2];


 if(size>size1){ // a>b

     len=size;  a2=a; a1=b;}

 if(size1>size){ // b>a

     len=size1; a2=b;  a1=a; }

 if(size1==size){ 

     len=size;  a2=b;  a1=a;} 

int[] temp=new int[len];

 int first=getLowest(size,size1);
 int second=getHighest(size,size1);

 for(int i=0; i<first; i++){

 for(int c=0; c<second; c++){

 if(a1[i]==a2[c]){id++; count++; temp[id]=a[i]; }

}

} int[] common = new int[count];

 for(int j=0; j<count; j++){

 common[j]=temp[j];

}

return common; }

public static void main(String args[]){

int[] getValues=f(numb1,numb);

 for(int w=0; w<getValues.length; w++){

 System.out.print(getValues[w]); }


}
}