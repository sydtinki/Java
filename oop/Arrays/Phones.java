class Phones{

String brand;

public static void main(String args[]) {

Phones[] phones = new Phones[3];

 int len = phones.length;

for(int i=0; i<phones.length; i++){

     phones[i] = new Phones(); 

}

len = len-1;

 phones[0].brand = "nokia";
 phones[1].brand = "sumsung";
 phones[2].brand = "hisense";

len--;

System.out.print(phones[len].brand);
}

}