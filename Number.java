class Number{

public static int num=123;
public static int out=0;
public static int c=3;

public static void main(String args[]){

do{c--;  out=num/10;

System.out.print(out+"\n");

num=out;

}while(c>0);

}

}