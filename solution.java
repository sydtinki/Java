public class solution {
	
	

static int n=1;
	
static int m=5;
	
	
private static String s = run(n,m);
	

	

public static String run(int N, int M) {


String out="";
	
for(int i=N; i<M; i++){
	

if(i%3==0){
 out+=",FIZZ";
	}
 

if(i%5==0){
	out+=",BUZZ";
}
	

if(i%3==0 && i%5==0){
	out+=",FIZZBUZZ";
}
 

else{ String t=","+i;
	out+=t;
	}
	}
		

String sequence = out;
	
char[] chs = sequence.toCharArray();
		
String rt="";
		
		

for(int j=1; j<chs.length; j++){

rt+=chs[j];
		}
		
return rt;
	}
	
	


public static void main(String[] args){

System.out.print(s);


}



}