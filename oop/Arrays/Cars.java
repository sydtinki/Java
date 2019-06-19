class Cars{

String type;

public static void main(String args[]) {

Cars[] typesOfCars = new Cars[4]; 

int len = typesOfCars.length;

for(int i=0; i<typesOfCars.length; i++){

     typesOfCars[i] = new Cars(); 
}

  typesOfCars[0].type = "van";
  typesOfCars[1].type = "motorcar";
  typesOfCars[2].type = "bus";
  typesOfCars[3].type = "truck";

System.out.print(typesOfCars[len/2].type);

}

}