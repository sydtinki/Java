class voidMthodSample {

 static double currentBal=50.0;

 static void withdraw(double bal){

 currentBal-=10; 

}

  public static void main(String args[]) {

 withdraw(10);

 System.out.print(currentBal);

}

}