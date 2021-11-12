class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //checking row 
        for(int i=0; i<9; i++)
        {
            Set<Character> rowSet= new HashSet<>(); 
            for(int j=0; j<9; j++)
            {
                if(board[i][j]=='.')
                    continue;
                else
                {
                char c= board[i][j];
                if(rowSet.contains(c))
                    return false;
                else
                    rowSet.add(c);
                }
            }

            
            
        }
        
       // column values
        for(int i=0; i<9; i++)
        {
            Set<Character> colSet= new HashSet<>();            
            for(int j=0; j<9; j++)
            {
                if(board[j][i]=='.')
                    continue;
                else
                {
                    char c= board[j][i];
                    if(colSet.contains(c))
                        return false;
                    else
                        colSet.add(c);
                }
            }
        }
        
        //checking box values

        for(int m=0; m<9; m+=3)
        {
            for(int n=0; n<9; n+=3)
            {
                Set<Character> boxVals = new HashSet<>();
                for(int i=n; i<n+3; i++)
                {
                    for(int j=m; j<m+3; j++)
                    {
                        if(board[i][j]=='.')
                            continue;
                        else
                        {
                        char c= board[i][j];
                        if(boxVals.contains(c))
                            return false;
                        else
                            boxVals.add(c);
                        }
                    }
                }
            }
            
        }
        return true; 
    }
}