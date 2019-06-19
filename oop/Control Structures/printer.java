class printer{

private static int MaximumCopies=100;

private static int MinimumCopies=1;

private static int numbOfCopies;

public void print(int x){

if(x>MaximumCopies){

 numbOfCopies = MaximumCopies;

}

 if(x<MinimumCopies){

numbOfCopies = MinimumCopies;}
}

public static void main(String args[]) {

 printer hp = new printer();

  hp.print(104);

   System.out.print(printer.numbOfCopies);

}

}