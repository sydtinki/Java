class compare3{

public static void main(String args[]){

String fruit ="apple";
String fruit1="banana";

char chars[] = fruit.toCharArray();
char chars1[] = fruit1.toCharArray();

char i = chars[0];
char j = chars1[0];

char min = (i<j) ? i:j;

 System.out.print(min);

}
}