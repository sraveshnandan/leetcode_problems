class Solution {
    public void moveZeroes(int[] nums) {
        int lp =0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!= 0){
                int tp = nums[i];
                nums[i]=nums[lp];
                nums[lp]=tp;
                lp++;
            }
        }
    }
}