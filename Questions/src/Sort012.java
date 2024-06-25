public class Sort012 {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int x:nums){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        Sort012 s=new Sort012();
        int arr[]={2,0,2,1,1,0};
        s.sortColors(arr);
    }
}
