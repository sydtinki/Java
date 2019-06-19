class Clothes{

String catergory;

public static void main(String args[]) {

 Clothes[] stock = new Clothes[3];
 
int len = stock.length;

for(int i=0; i<stock.length; i++){

     stock[i] = new Clothes(); 
}

 stock[0].catergory = "trouser";
 stock[1].catergory = "shirt";
 stock[2].catergory = "top";

len = len-len;

System.out.print(stock[len+1].catergory);

}

}