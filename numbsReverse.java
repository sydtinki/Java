class numbsReverse{

public static int num=-1*1234;
public static int rev=0;
public static int count,times=0;
public static int hold=num*1;

static int revnum(int p, int y){ 

if(y==1){ 

 rev=p; }

 
 if(y>1){ 

 while(p!=0){count++;  int r=p%10; 

 if(count==1){ rev=r; } // first round dont multiply by ten

 if(count>1){ rev=rev*10+r; }

  p/=10; }

} 

return rev;

}

static void print(){

while(num!=0){ times++;

 num/=10;

} 

System.out.print(revnum(hold,times));

 
}

public static void main(String args[]){

print();

}

}