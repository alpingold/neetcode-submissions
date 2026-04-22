class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int x=0; x<nums.length; x++){
                if(nums[i]+nums[x]==target && x!=i){
                    return new int[]{i,x};
                }
            }
        }
        return new int[] {nums[0],nums[0]};
    }
}
