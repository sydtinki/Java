class Upper2 {
    public static void main(String args[]) {

String s = "hello world";
 char[] chrs = s.toCharArray();
 String firstLetter = "";

 firstLetter += chrs[0];

 firstLetter = firstLetter.toUpperCase();

 for(int j=1; j<chrs.length; j++){

 if(chrs[j]==' '){

 String x ="";

 x+=chrs[j+1]; x = x.toUpperCase();

 char[] ch = x.toCharArray();

chrs[j+1]=ch[0];

}

  firstLetter += chrs[j];

}

 System.out.print(firstLetter);

}
}