class Solution {
    private List<Integer> lengths = new ArrayList<>();
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            lengths.add(str.length());
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int point = 0;
        for(int leng: lengths){
            decoded.add(str.substring(point,leng+point));
            point+=leng;
        }
        return decoded;

    }
}
