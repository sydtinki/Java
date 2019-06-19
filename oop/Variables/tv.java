class tv{

private static String status;

public void switchOn(){

this.status = "on";

}

public void switchOff(){

this.status = "off";

}

public static void main(String args[]) {

tv sumsung = new tv();

sumsung.switchOn();

tv sony = new tv();

sony.switchOff();

System.out.print(sony.status);
}

}