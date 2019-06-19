class Heater{

private static int temp;

private static int levelOne = 4;

public void level(int x){

 temp = x;
}

public static void main(String args[]) {

Heater myHeater = new Heater();

 myHeater.level(levelOne);

   System.out.print(myHeater.temp);

}

}