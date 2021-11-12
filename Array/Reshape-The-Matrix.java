class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int m= mat.length;
        int n= mat[0].length;
        if((r*c)!= (m*n))
            return mat;
        
        else
        {
            int [][] newMat= new int[r][c];
            ArrayList<Integer> allValues= new ArrayList<>(); 
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    allValues.add(mat[i][j]);
                }
            }
            int k=0;
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    newMat[i][j]= allValues.get(k);
                    
                    k++;
                }
            }
            
        return newMat;
        }
    }
}