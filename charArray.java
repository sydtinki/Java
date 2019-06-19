class charArray{

public static char[] letters={'a','b','c','d','e'};

static char[] f(char[] arry, int start, int len){

 int err=0;
 int Alength=arry.length;
 int id=-1;

char[] output=new char[Alength];

  if(len<0 || len > Alength){
 
  err=1;

}   if(start<0 || start>Alength){

  err=1;

}

 if(err==1){

 output=new char[0];

}

 if(err==0){

 for(int j=start; j<len+1; j++){ id++;

 output[id]=arry[j];

}}

return output;

}


public static void main(String args[]){

 char[] getChars=f(letters,1,3);

 for(int i=0; i<getChars.length; i++){

 System.out.print(getChars[i]);

}

}

}