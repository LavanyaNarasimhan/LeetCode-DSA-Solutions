class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> numCount= new HashMap<>(); 
        
        for(int i=0; i<nums.length; i++)
        {
            if(numCount.containsKey(nums[i]))
            {
               
               return true;
               
            }
            else
                numCount.put(nums[i], 1);
            
        }
        return false;
    }
}