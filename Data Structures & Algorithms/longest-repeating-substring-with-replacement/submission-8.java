class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqs = new int[26];
        int l = 0;
        int max = 0;
        int res = 0;
        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
            freqs[current-'A']++;
            max=Math.max(max,freqs[current-'A']);
            if(i-l+1-max<=k){
                res=Math.max(res,i-l+1);
            }
            else{
                while(!(i-l+1-max<=k)&&l!=i){
                    current = s.charAt(l);
                    freqs[current-'A']--;
                    l++;
                }
            }
        }
        return res;
    }
}
