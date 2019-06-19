class Book{

private static String Author;
private static int NumbOfPages;
private static String Title;

 public void publish(String A, int N, String T){

 this.Author = A;
 this.NumbOfPages = N;
 this.Title = T; 

}

public static void main(String args[]) {

Book textBook = new Book();
textBook.publish("Syd",300,"Intoduction to Java");

String sign = ".";

System.out.print(textBook.Title+sign);

}

}