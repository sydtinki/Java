class Heater{

private static int MaximumTemp=1;

private static int MinimumTemp=20;

private static int temp=0;

public void increaseTemp(int x){

if(x>0 && x<20){

 temp += x; 
}

  if(x<0){

temp=0; 
}

   if(x>20){

temp = 20;
}
}

public static void main(String args[]) {

Heater myHeater = new Heater();

 myHeater.increaseTemp(30);

   System.out.print(myHeater.temp+ "C");

}

}