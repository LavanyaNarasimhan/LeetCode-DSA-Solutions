class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int targetRow=0;
        for(int i=0; i<matrix.length; i++)
        {
          if(target==matrix[i][0])
              return true;
          else if(target<matrix[i][0] && i>0)
          {
              targetRow=i-1;
              break;
          }
          else
          {
              targetRow=i;     
          }
            
        }
        for(int i=0; i<matrix[0].length; i++)
        {
            if(target==matrix[targetRow][i])
                return true;
                
        }
        return false;
    }
}