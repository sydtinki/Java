
class Srch1{

public static void main(String args[]) {
int[] nums={1,2,3,4,5,6,7,8,3};
int[] pos=new int[nums.length-1];
int find=3;
int idx=-1;
int count=0;

for(int i=0; i<nums.length; i++){
if(nums[i]==find){ count++;
  pos[++idx]=i;
}
  
}
  System.out.println("\tSearch for 3 found at index:");

  for(int i=0; i<count; i++){
      
     System.out.println("\t"+pos[i]);
  }

}
}
