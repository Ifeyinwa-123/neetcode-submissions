class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> record= new HashMap<>();

        for (int num:nums){
            record.put (num, record.getOrDefault(num,0)+1);

        }

        PriorityQueue<Integer> maxheap= new PriorityQueue<>((a,b) -> record.get(b).compareTo(record.get(a)));
        maxheap.addAll(record.keySet());
        int[] answer =new int[k];

        for (int i=0; i<k;i++){
            answer[i]=(maxheap.poll());

        }
        return answer;
        
    }
}
