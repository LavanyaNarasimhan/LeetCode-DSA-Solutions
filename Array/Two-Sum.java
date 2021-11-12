class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> numsMap= new HashMap<>(); 
        for(int i=0; i<nums.length; i++)
        {
            if(!numsMap.containsKey(nums[i]))
                numsMap.put(nums[i], i);
        }
        int [] res= new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int val= target-nums[i];
            if(numsMap.containsKey(val) && i!=numsMap.get(val))
            {
                res[0]=i;
                res[1]= numsMap.get(val);
            }
        }
        
        return res;
        
    }
}