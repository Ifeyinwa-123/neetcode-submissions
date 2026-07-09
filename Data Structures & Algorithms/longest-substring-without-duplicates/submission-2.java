class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character, Integer> track = new HashMap<>();
        int l=0;
        int maxlength=0;

        for(int r=0; r<s.length();r++){
            if(track.containsKey(s.charAt(r))){
                l= Math.max(track.get(s.charAt(r))+1,l);
            }
            track.put(s.charAt(r),r);;
            maxlength=Math.max(maxlength, r-l+1);

        }
        return maxlength;
  
    }
}
