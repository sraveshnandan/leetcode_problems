class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min=nums[0],max=nums[0];
        for(int n : nums){
            set.add(n);
            if(n>max) max= n;
            if(n<min) min =n;
        }
        for(int i = min;i<=max;i++){
          if(!set.contains(i)) res.add(i);
        }
        return res;
    }
}