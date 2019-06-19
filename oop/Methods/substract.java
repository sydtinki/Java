class substract{

private static int val=0;

public static void substract(int x){

val-=x;

}


public static void main(String args[]) {

int a = 5;

int b = 8;

substract number = new substract();

number.val = b;

number.substract(a);

System.out.print(number.val);

}

}