class Employees{

String position;

public static void main(String args[]) {

  Employees[] staff = new Employees[3];

int len = staff.length;

for(int i=0; i<staff.length; i++){

     staff[i] = new Employees(); 
}

staff[0].position = "manager";
staff[1].position = "cleaner";
staff[2].position = "gardner";

 System.out.print(staff[len-len].position);


}

}