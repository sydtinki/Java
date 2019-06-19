class sortAsc{

static int[] numbs={8,7,6,5,4,33,2};

static int[] sort(int[] nums){

int count=nums.length;
int c=0;

do{ c++;

for(int i=0; i<count-1; i++){ 

 if(nums[i]>nums[i+1]){ 

 int A=nums[i]; int B=nums[i+1]; 

 nums[i]=B; nums[i+1]=A; 

 }

}  

}while(c<count);


return nums;}


public static void main(String args[]) {

int[] sorted=sort(numbs);

for(int t=0; t<sorted.length; t++){

System.out.print(sorted[t]+"\n"); }


}
}