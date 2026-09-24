class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for(int i = 0; i<=board.length-1; i++){
            for(int j = 0; j<=board.length-1; j++){
                char num = board[i][j];
                String box = checkBox(i, j);
                if(num != '.'){
                    if(!seen.add(num + "r" + i)) return false;
                    if(!seen.add(num + "c" + j)) return false;
                    if(!seen.add(num + "box" + box)) return false;
                }
            }
        }

        return true;

        
    }

    public String checkBox(int i, int j) {
        int box = (i / 3) * 3 + (j / 3);
        return String.valueOf(box);
    }
}
