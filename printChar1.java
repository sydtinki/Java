class printChar1 {

static char start=97;
static int count=0;

static void print(){

 do{ count++;

 start++;

}while(count<25);

 System.out.print(start);

}

public static void main(String args[]){

print();

}

}