class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int a = nums[i];
            int diff= target-a;

            if (numbers.containsKey(diff)){
                return new int [] {numbers.get(diff), i};
            }

            numbers.put(a,i);

        }
        
    return new int[] {};
    }
    
}
