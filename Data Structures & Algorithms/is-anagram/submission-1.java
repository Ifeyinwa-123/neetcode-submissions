class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;

        }else{
            Map <Character,Integer> strack =new TreeMap<>();
            Map <Character,Integer> ttrack =new TreeMap<>();

            for (int i=0;i<s.length();i++){
                strack.put(s.charAt(i), strack.getOrDefault(s.charAt(i),0)+1);
                ttrack.put(t.charAt(i), ttrack.getOrDefault(t.charAt(i),0)+1);
            }
            return strack.equals(ttrack);
            }

        }
        

    }

