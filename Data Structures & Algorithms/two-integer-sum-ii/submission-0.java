class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointerTwo = numbers.length-1;
        for(int pointerOne = 0; pointerOne<pointerTwo;){
            int currSum = numbers[pointerOne]+numbers[pointerTwo];
            if(currSum>target){
                pointerTwo--;
            }
            else if(currSum<target){
                pointerOne++;
            }
            else{
                return new int[] {pointerOne+1,pointerTwo+1};
            }
        }
        return new int[] {0,0};
    }
}
