class divide{

private static int val=0;

public static void divide(int x){

val/=x;

}


public static void main(String args[]) {

int a = 5;

int b = 8;

divide number = new divide();

number.val = b;

number.divide(a);

System.out.print(b+" divided by a is "+number.val);

}

}