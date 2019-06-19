class Retrn {
public static String empty="";
public static int[] numbs={2,4,6,8};

public static String WriteStr(String x){
return x;
}

public static double WriteDb(double x){
return x;
}

public static void main(String args[]) {

for(int i=0; i<numbs.length; i++){ 
 String newStr=empty+numbs[i];

System.out.println("\t"+WriteStr(newStr));


}
  System.out.println("\t\nPrinting as Double:\n");

for(int i=0; i<numbs.length; i++){
System.out.println("\t"+WriteDb(numbs[i]));
}
  System.out.println("\t\nPrinting string plus int:\n");

for(int i=0; i<numbs.length; i++){
System.out.println("\tHello "+numbs[i]);
}
}
}