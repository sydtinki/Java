class returnN{

static char[] letters={'a','b'};

static char[] back(){ 

char[] empty=new char[0];
boolean print=true;

if(!print){

 return empty; }

return letters;

}
public static void main(String args[]){

 System.out.print(back());

}

}