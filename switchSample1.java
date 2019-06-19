class switchSample1{

static String[] days = {"Monday","Tuesday","Wednesday","Thursday"};
                

static String today = days[days.length-4];


public static void main(String args[]){ 

 switch(today){

 case "Tuseday": System.out.print("Tue");
 break;

 case "Monday": System.out.print("Mon");
 break;

 default: System.out.print("this will be printed ");

}


}

}