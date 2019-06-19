class NumbPairs {

static int[] list = {1,2,1,2,5,6,5};
static int find=0,single=0;
static int idx=-1;

public static void main(String args[]) {

do{ idx++; int count=0;

 find=list[idx];

 for(int i=0; i<list.length; i++){
if(list[i]==find)
  count++;
}

 if(count==1){
   single=find; 
}

}while(idx<list.length-1);

System.out.print(single);

} }






