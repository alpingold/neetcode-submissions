class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int num:nums){
            numbers.add(num);
        }
        int currSeq = 0;
        int newSeq=0;
        for(int num:nums){
            int temp = num+1;
            if(!(numbers.contains(num-1))){
                newSeq = 1;
                while(numbers.contains(temp)){
                    newSeq+=1;
                    temp+=1;
                }
            }
            if(newSeq>currSeq){
                currSeq=newSeq;
            }
        }
        return currSeq;
    }
}
