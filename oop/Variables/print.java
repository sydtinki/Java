class print{

private static int copies;

public void print(int x){

this.copies = x;

}


public static void main(String args[]) {

print Copy = new print();

Copy.print(6);

System.out.print(Copy.copies);
}

}