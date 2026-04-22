class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if(s.length()!=t.length()){
            return false;
        }
        if(Arrays.equals(first,second)){
            return true;
        }
        return false;
    }
}
