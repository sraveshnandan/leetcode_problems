class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int z_c=0,o_c=0,t_c=0;
        for(int i = 0 ; i<n;i++){
            if(nums[i] == 0){
                z_c++;
            }else if(nums[i] == 1){
                o_c++;
            }else{
                t_c++;
            }
        }

        int i =0;
        while(z_c>0){
            nums[i] = 0;
            i++;
            z_c--;
        }
        while(o_c>0){
            nums[i] = 1;
            i++;
            o_c--;
        }
        while(t_c>0){
            nums[i]=2;
            i++;
            t_c--;
        }

        
    }
}