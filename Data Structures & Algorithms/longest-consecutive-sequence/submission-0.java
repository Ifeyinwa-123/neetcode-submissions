class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numbers= new HashSet<>();
        for (int i=0; i<nums.length; i++){
            numbers.add(nums[i]);
        }
        
        int longest =0;
        for (int num:nums){
            if(!numbers.contains(num-1)){
                int currentnum=num;
                int currentlength=1;
            

            while(numbers.contains(currentnum+1)){
                currentnum++;
                currentlength++;

            }
            longest=Math.max(longest,currentlength);
            }
        }
        return longest;


    }
}

