class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max =0;
        int point =0;
        HashMap<Character,Integer> unique = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(unique.containsKey(s.charAt(i))){
                max = Math.max(max,i-point);
                point=Math.max(unique.get(s.charAt(i))+1,point);
                unique.put(s.charAt(i),i);
            }
            else{
                max=Math.max(max,i-point+1);
                unique.put(s.charAt(i),i);
            }
        }
        return max;
    }
}
