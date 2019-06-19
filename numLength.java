class numLength{

public static int c=1234;
public static int i,times=0;
public static int hold,deflt=0;

static void get(int i){ times++;

if(times==1){
hold+=i;
}

if(times>1){

hold=hold*10*1;
hold+=i;
}

}


public static int run(){ deflt=c;

while(c!=0){ int n=c%10; get(n);

c=c/10;

i++;

}

return i;
}

public static void main(String args[]){

System.out.print("Length of "+c+" equals "+run()+"\n");

System.out.print("When we reverse "+deflt+" we get "+hold);

}

}