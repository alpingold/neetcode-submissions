
class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int x=0; x<nums.length; x+=1){
            for(int y=0;y<nums.length;y+=1){
                if(nums[x]==nums[y] && x!=y){
                return true;
                }
            }
        }
        return false;
    }
}