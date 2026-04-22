class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        res[0]=1;
        //prefix
        for(int i =0;i<length-1;i++){
            res[i+1]=res[i]*nums[i];
        }
        //suffix
        int suffix = 1;
        for(int i=length;i>0;i--){
            res[i-1]= suffix*res[i-1];
            suffix*=nums[i-1];
        }
        return res;
    }
}  
