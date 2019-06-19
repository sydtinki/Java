class Animals{

String name;

public static void main(String args[]) {

Animals[] animals = new Animals[3];

int len = animals.length;

for(int i=0; i<animals.length; i++){

     animals[i] = new Animals(); 
}

animals[0].name = "cow";
animals[1].name = "goat";
animals[2].name = "donkey";

System.out.print(animals[len-len].name+", "+animals[len-2].name);

}

}