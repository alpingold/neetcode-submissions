class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashSet<String> ops = new HashSet<>();
        ops.add("*");
        ops.add("-");
        ops.add("+");
        ops.add("/");
        for(String str: tokens){
            if(ops.contains(str)){
                int post = stack.pop();
                int pre = stack.pop();
                if(str.equals("*")){
                    stack.add(pre*post);
                }
                if(str.equals("/")){
                    stack.add(pre/post);
                }
                if(str.equals("-")){
                    stack.add(pre-post);
                }
                if(str.equals("+")){
                    stack.add(pre+post);
                }
            }
            else{
                stack.add(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }
}
