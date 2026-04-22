class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> grams = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            grams.putIfAbsent(sortedStr, new ArrayList<>());
            grams.get(sortedStr).add(str);

        }
        return new ArrayList<>(grams.values());
    }
}
