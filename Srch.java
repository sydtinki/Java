
class Srch{

public static void main(String args[]) {
int[] nums={1,2,3,4,5,6,7,8,3};
int find=3;
int idx=-1;

for(int i=0; i<nums.length; i++){
if(nums[i]==find)
  System.out.println(find+" found at index: "+i);
}

}
}
