class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<ArrayList<Integer>,ArrayList<Character>> box = new HashMap<>();
        for(int h = 0; h<9;h++){
            Set<Character> vertical = new HashSet<>();
            Set<Character> horizontal = new HashSet<>();
            for(int i =0; i<9;i++){
                ArrayList<Integer> boxCords = new ArrayList<>(Arrays.asList(h/3,i/3));
                char vert = board[i][h];
                char hor = board[h][i];
                if(horizontal.contains(hor)){
                    return false;
                }
                if(vertical.contains(vert)){
                    return false;
                }
                if(box.containsKey(boxCords)){
                    if(box.get(boxCords).contains(hor)){
                        return false;
                    }
                }
                if(hor!='.'){
                    horizontal.add(hor);
                    box.putIfAbsent(boxCords, new ArrayList<>());
                    box.get(boxCords).add(hor);
                }
                if(vert!='.'){
                    vertical.add(vert);
                }
                

            }
        }
        return true;
    }
}
