class q3{

static char[] letters={'a','b','c','d'};

static char[] a3(char[] a, int start, int length) {

if (length < 0 || start < 0 || start+length-1>=a.length) {

         return null; }
     char[] sub = new char[length];

for (int i=start, j=0; j<length; i++, j++) { sub[j] = a[i]; }

return sub;}

public static void main(String args[]){

 System.out.print(a3(letters,0,3));

}

}