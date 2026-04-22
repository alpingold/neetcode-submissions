class Solution {
    public int trap(int[] height) {
        int left =0;
        int maxLeft =height[left];
        int right = height.length -1;
        int maxRight=height[right];
        int res=0;
        while(left!=right){
            if(height[left]<height[right]){
                left++;
                if(maxLeft-height[left]>0){
                    res+=maxLeft-height[left];
                }
                if(height[left]>maxLeft){
                    maxLeft = height[left];
                }
            }
            else{
                right--;
                if(maxRight-height[right]>0){
                    res+=maxRight-height[right];
                }
                if(height[right]>maxRight){
                    maxRight=height[right];
                }
            }
        }
        return res;
    }
}
