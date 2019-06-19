class switchSample2{

static char[] grade = {'A','B','C','D'};
                

static int id = 3;


public static void main(String args[]){ 

 while(id>=1){

id--;}

 char perfomance = grade[id];

 switch(perfomance){

 case 'A': System.out.print("Excellent");
 break;

 case 'B': System.out.print("Good");
 break;

 case 'C': System.out.print("Better");
 break;

 case 'D': System.out.print("Fail");
 break;

 default: System.out.print("this will be printed ");

}


}

}