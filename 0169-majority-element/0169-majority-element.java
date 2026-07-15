class Solution {
    public int majorityElement(int[] nums) {
        int tp = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                tp = i;
            }
            if(nums[tp] == nums[i]){
                count++;
            }else{
                count--;
            }

        }
        return nums[tp];
    }
}