class onebetween{

static int onebetween=0;
static int[] numbs={1,2,1,2,1};

public static void main(String args[]){

for(int i=1; i<numbs.length-2; i++){

 if(numbs[i]==1 && numbs[i]+numbs[i-1]+numbs[i+1]==5){ onebetween++;

 System.out.print("1 between 2s\n");

} else

 { 
 System.out.print("No 1 between 2s\n"); }

}
 
 System.out.print("\n\t"+onebetween);

}

}