public class Puppy{
int puppyAge;
String puppyName;

public Puppy(){

}

public void setAge( int age ){
puppyAge = age;
}

public void setName( String name ){
puppyName = name;
}

public static void main(String []args){
/* Object creation */

Puppy myPuppy = new Puppy();

/* Call class method to set puppy's age */
myPuppy.setName("Sekapu");
myPuppy.setAge( 2 );


/* You can access instance variable as follows as well */
System.out.println("Age:" + myPuppy.puppyAge );
System.out.println("Puppy`s name :" + myPuppy.puppyName );
}
}