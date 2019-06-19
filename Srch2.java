
class Srch2{

public static void main(String args[]) {
char[] chars={'a','b','c','c','d'};
char find='c';


for(int i=0; i<chars.length; i++){
if(chars[i]==find)
  System.out.println(find+" found at index: "+i);
}

}
}
