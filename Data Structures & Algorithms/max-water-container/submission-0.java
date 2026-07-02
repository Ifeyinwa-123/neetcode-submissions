class Solution {
    public int maxArea(int[] heights) {
        
        int maxarea=0;
        int n=heights.length;
        

        for (int i=0;i<n;i++){
            int j=n-1;
            while(i<j){
                int area= (j-i)* Math.min(heights[i],heights[j]);
                if (area>maxarea){
                    maxarea=area;
                }
                j--;
            }
            

        }
        return maxarea;
    }
}
