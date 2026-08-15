class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> track=new HashMap<>();

        int l=0;
        int result=0;
        int maxf=0;

        for (int r=0; r<s.length();r++){
            track.put(s.charAt(r), track.getOrDefault(s.charAt(r),0) + 1);
            maxf=Math.max(maxf,track.get(s.charAt(r)));

            while((r-l+1)-maxf>k){
                track.put(s.charAt(l), track.get(s.charAt(l)) - 1);
                l++;

            }
            result= Math.max(result,r-l+1);


        }
        return result;
    }
}
