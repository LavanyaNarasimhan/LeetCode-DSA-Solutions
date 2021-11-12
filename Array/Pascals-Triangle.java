class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<ArrayList<Integer>> pascalTriangle= new ArrayList<ArrayList<Integer>>();
        List<List<Integer>> finalTriangle= new ArrayList<List<Integer>>();
        for(int i=0; i<=30; i++)
        {
            ArrayList<Integer> innerList= new ArrayList<>(i); 
            if(i==0)
                innerList.add(1);
            else
            {
               innerList.add(0, 1);
               List<Integer> previousList= pascalTriangle.get(i-1);
               for(int j=1; j<previousList.size(); j++)
               {
                   int sum= previousList.get(j-1) + previousList.get(j);
                   innerList.add(sum);
               }
               innerList.add(innerList.size(), 1);
            }
            pascalTriangle.add(innerList);
            
        }
        
        for(int i=0; i<numRows; i++)
        {
            finalTriangle.add(pascalTriangle.get(i));
        }
        return finalTriangle;
    }
}