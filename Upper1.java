class Upper1 {
    public static void main(String args[]) {

 String s = "hello world";
 char[] chrs = s.toCharArray();
 String firstLetter = "";

 firstLetter += chrs[0];

 firstLetter = firstLetter.toUpperCase();

 for(int j=1; j<chrs.length; j++){

  firstLetter += chrs[j];

}

 System.out.print(firstLetter);

}}