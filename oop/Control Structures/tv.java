class tv{

private static String status;

public void switchTv(String x){

 if(status!="on" || status !="off"){

status = x;

}

  if(status=="on" && x=="on"){

 status = "on"; // tv remains on

}

  if(status=="off" && x=="off"){

 status = "off"; // tv remains off

}

}

public static void main(String args[]) {

 tv sony = new tv();

 sony.switchTv("on");

 sony.switchTv("off");

   System.out.print(sony.status);

}

}