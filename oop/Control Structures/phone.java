class phone{

private static String status;

public void switchPhone(String x){

 if(status!="on" || status !="off"){

status = x;

}

  if(status=="on" && x=="on"){

 status = "on"; // phone remains on

}

  if(status=="off" && x=="off"){

 status = "off"; // phone remains off

}

}

public static void main(String args[]) {

 phone nokia = new phone();

 nokia.switchPhone("on");

 nokia.switchPhone("on");

   System.out.print(nokia.status);

}

}