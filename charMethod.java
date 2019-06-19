class charMethod{

static char assess(char g){

 char pos='0';

 switch(g){
 
 case 'A': pos='1';
 break;

 case 'B': pos='2';
 break;

 default: pos='3';

}

 return pos; }

    public static void main(String args[]) {

 System.out.print(assess('A'));

}

}