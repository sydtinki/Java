class modulo{

private static int val=0;

public static void modulo(int x){

val%=x;

}


public static void main(String args[]) {

int a = 5;

int b = 8;

modulo number = new modulo();

number.val = b;

number.modulo(a);

System.out.print(number.val);

}

}