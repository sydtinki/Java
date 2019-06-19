class Book{

private static int FirstPage = 1;

private static int currentPage;

private static int NumbOfPages = 100;

public void openPage(int x){

 if(x>0 && x<=100){

currentPage = x;

}

if(x>NumbOfPages){

currentPage = NumbOfPages;
}

if(x<0){

currentPage = FirstPage;}
}

public static void main(String args[]) {

Book noteBook = new Book();

 noteBook.openPage(101);

   System.out.print(noteBook.currentPage);

}

}