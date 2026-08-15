class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> tracks1= new HashMap<>();
        int l=0, r=s1.length();

        for(int i=0; i<s1.length(); i++){
            tracks1.put(s1.charAt(i),tracks1.getOrDefault(s1.charAt(i),0)+1);
        }       

        while(r<=s2.length()){
            HashMap<Character,Integer> count=new HashMap<>();
            for(int k=l; k<r; k++){
                count.put(s2.charAt(k), count.getOrDefault(s2.charAt(k),0)+1);

            }
            if (count.equals(tracks1)){
                return true;
            }
            else{
                l++;
                r++;
            }
        }
        return false;


        
    }
}
