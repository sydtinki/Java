class NoSpaces{

static String str="Hello there and how are you";
static char[] sentence = str.toCharArray();

static int spaces=countSapces();
static int i=0;

static int countSapces(){ int bck=0;

 for(i=0; i<sentence.length; i++){

 if(sentence[i]==' '){ bck++;}

}


return bck;}


public static void main(String args[]) {

 System.out.print(str+": "+spaces);

}

}