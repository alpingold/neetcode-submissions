class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        boolean res = false;
        if(s1.length()>s2.length()){
            return false;
        }
        for(char c : s1.toCharArray()){
            freq1.putIfAbsent(c,0);
            freq1.put(c,freq1.get(c)+1);
        }
        int r = 0;
        for(int l=0;r<s2.length();l++){
            while(r-l<s1.length()){
                char check = s2.charAt(r);
                freq2.putIfAbsent(check,0);
                freq2.put(check,freq2.get(check)+1);
                r++;
            }
            for(char c: s1.toCharArray()){
                if(freq1.get(c)!=freq2.get(c)){
                    res = false;
                    break;
                }
                else{
                    res = true;
                }
            }
            if(res==true){
                return res;
            }
            freq2.put(s2.charAt(l),freq2.get(s2.charAt(l))-1);
        }
        return res;
    }
}
