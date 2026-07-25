class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int prev=0, cur =0;
        int i = 0,j=0;
         for (int count = 0; count <= total / 2; count++) {
            prev = cur;

            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                cur = nums1[i++];
            } else {
                cur = nums2[j++];
            }
        }

        if(total%2 == 0){
            return (cur+prev)/2.0;
        }
        return cur;
    }
}