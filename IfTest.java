class IfTest{

static double balance = 300000.00;

static double update(double bal){

bal+=20;

return bal; }

public static void main(String[] args){

 if(balance<300020){

  balance = update(balance);  }


 System.out.print(balance);

}
}