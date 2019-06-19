class centeredArry{

// program to check whether an array is centered or not

// a centered array`s median element is less that all the elements

// if its a centered array return o otherwise return 1

public static int[] numbs={2,3,4,1,6,7,8};
public static int i,half=0;
public static int bool=1;

static int getArray(int[] x){ int len=x.length; 

 if(len%2==0){

  bool=0; }

 if(len%2==1){

 half=len/2; 

 int median=x[half]; 

 for(i=half; i<len; i++){

 if(x[i]<median){  bool=0; 

 }
if(x[i]>median){  bool=1;

 }

}

 for(i=half; i>0; i--){

  if(x[i]<median){  bool=0;

 }
if(x[i]>median){  bool=1;

 }

}

 }

 return bool;

}

public static void main(String args[]){
 
 System.out.print(getArray(numbs));

}

}