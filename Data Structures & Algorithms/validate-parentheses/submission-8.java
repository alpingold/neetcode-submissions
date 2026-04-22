class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        char[] chars = s.toCharArray();
        if(chars.length<2) return false;
        for(int i=0;i<chars.length;i++){
            if(map.keySet().contains(chars[i])&&i!=0){
                if((!stack.empty())&&stack.peek()==map.getOrDefault(chars[i],'a')){
                    stack.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            stack.push(chars[i]);
        }
        return stack.empty();
    }
}
