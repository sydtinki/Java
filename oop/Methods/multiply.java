class multiply{

private static int val=0;

public static void multiply(int x){

val*=x;

}


public static void main(String args[]) {

int a = 5;

int b = 8;

multiply number = new multiply();

number.val = b;

number.multiply(a);

System.out.print(number.val);

}

}