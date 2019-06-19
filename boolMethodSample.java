class boolMethodSample {

 static Boolean status=false;
 static int flag=8;

 static Boolean condition(){

 if(flag==8){

 status=true; }

 return status; }

public static void main(String args[]) {

 flag=flag+4*1;

 flag%=3;

 System.out.print(condition());

}

}