import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //int[] arr2=new int[nums.length];
       int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[count++]=nums[i];
           }
       }
       String str=Arrays.toString(nums);
       System.out.println(str);
   }

   public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        MoveZeroes x=new MoveZeroes();
        x.moveZeroes(arr);
    }
}
