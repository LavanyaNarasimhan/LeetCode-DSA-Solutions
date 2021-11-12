class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int windowSum=0; 
        int max= Integer.MIN_VALUE; 
        int negSum=0; 
        for(int i=0; i<nums.length; i++)
        {
            windowSum+= nums[i];
            if(windowSum> max)
                max=windowSum; 
            if(windowSum<0)
                windowSum=0; 
            if(nums[i]<0)
                negSum++;
        }
        if(negSum==nums.length)
        {
            Arrays.sort(nums);
            return nums[nums.length-1];
            
        }
        return max;
        
        
    }
}