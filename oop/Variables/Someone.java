class Someone{

private static String name;
private static int age;
private static String gender;

 public void who(String N, int A, String G){

 this.name = N;
 this.age = A;
 this.gender = G;

}

public static void main(String args[]) {

Someone child = new Someone();
child.who("Evans", 11, "Female");

System.out.print(child.name+" is aged"+child.age);

}

}