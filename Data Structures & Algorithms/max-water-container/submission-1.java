class Solution {
    public int maxArea(int[] heights) {
        
        int maxarea=0;
        int n=heights.length;
        int i =0;

        int j=n-1;
        while(i<j){
            int area= (j-i)* Math.min(heights[i],heights[j]);
            if (area>maxarea){
                maxarea=area;
            }
            if (heights[i]<heights[j]){
                i++;
            
            }else{
                j--;
            }
            
            

        }
        return maxarea;
    }
}
