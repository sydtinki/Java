class strLength{

public static void main(String params[]){

int i=0;
String str="Hello world!";
char[] len=str.toCharArray();

for(char c : len){

 if(c!='\0')
 i++;
}

  System.out.print(i+"\n");

 System.out.print("char at index 0 of '"+str+"' is "+len[0]);
}

}