class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = 0, r=0,k=0;
        int res[] = new int[nums1.length+nums2.length]; 
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]<nums2[r]){
                res[k++]=nums1[l++];
            }else{
                res[k++] = nums2[r++];
            }
        }
        while(l<nums1.length){
            res[k++] = nums1[l++];
        }
        while(r<nums2.length){
            res[k++] = nums2[r++];
        }
        for(int i : res){
            System.out.print(i+ " ");
        }
       int n = res.length;

        if (n % 2 == 0) {
            return (res[n / 2] + res[n / 2 - 1]) / 2.0;
        } else {
            return res[n / 2];
        }
    }
    
}