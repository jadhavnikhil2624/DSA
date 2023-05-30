class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        int n=board.length,m=board[0].length;
        char start=word.charAt(0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==start){
                    if(dfs(i,j,board,word,0))return true;
                }
            }
        }
        return false;
    }
    boolean dfs(int i,int j,char[][] board,String word,int ind){
        // outof bound cases
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)return false;
        if(ind>=word.length())return true;
        
        boolean res=false;
        if(board[i][j]==word.charAt(ind)){
            board[i][j]='-';
            res=(dfs(i+1,j,board,word,ind+1) ||
                 dfs(i-1,j,board,word,ind+1) ||
                 dfs(i,j+1,board,word,ind+1) ||
                 dfs(i,j-1,board,word,ind+1)
                );
                board[i][j]=word.charAt(ind);
        }
        return res;
    }
}