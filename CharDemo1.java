// Demonstrate char data type.

class CharDemo1 {
public static void main(String args[]) {
char ch;
char [] chars={1,2,3,4,5,6,88,89,90};
int i;

// char 88 is x and 89 is y there is no char 90 and other numbers
// char 1 - 6 are symbols

for(i=0; i<8; i++){
  ch=chars[i];
    System.out.println("  "+ch);
}
}
}