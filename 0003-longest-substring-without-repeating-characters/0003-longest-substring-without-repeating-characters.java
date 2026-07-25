class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count=0;
        Map<Character,Integer> mp = new HashMap<>();
        int l=0;
        for(int r= 0;r<n;r++){
            char ch = s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>1){
                char left_char = s.charAt(l);
                mp.put(left_char,mp.get(left_char)-1);
                l++;
            }
            count = Math.max(count,r-l+1);
        }
        
        return count;
    }
}