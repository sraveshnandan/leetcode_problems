class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0,right=n-1;
        int max_area = 0;
        while(left<=right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            int area = h*w;
            max_area = Math.max(max_area,area);
            //condition when pointers needs to be updated 
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_area;
    }
}