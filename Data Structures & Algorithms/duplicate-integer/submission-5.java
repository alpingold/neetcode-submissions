class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> found = new HashSet<Integer>();
        for(int num: nums){
            if(found.contains(num)){
                return true;
            }
            found.add(num);
        }
        return false;
    }
}