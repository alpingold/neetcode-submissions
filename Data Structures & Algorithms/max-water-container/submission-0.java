class Solution {
    public int maxArea(int[] heights) {
        int right =heights.length-1;
        int left =0;
        int max=0;
        while(left<right){
            int currMax = (right-left)*Math.min(heights[left],heights[right]);
            max = Math.max(max,currMax);
            if(heights[right]<heights[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }
}
