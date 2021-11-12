class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int maxNum= Math.max(nums1.length, nums2.length);
        ArrayList<Integer> num1List= new ArrayList<>(); 
        ArrayList<Integer> num2List= new ArrayList<>(); 
        for(int i=0; i<nums1.length; i++)
            num1List.add(nums1[i]);
        for(int i=0; i<nums2.length; i++)
            num2List.add(nums2[i]);
        ArrayList<Integer> res= new ArrayList<>(); 
        if(maxNum==nums1.length)
        {
            for(int i=0; i<nums2.length; i++)
            {
                Integer num= new Integer(nums2[i]);
                if(num1List.contains(num))
                {
                    res.add(num);
                    num1List.remove(num);
                    
                }
            }

        }
        
        else if(maxNum==nums2.length)
        {
            for(int i=0; i<nums1.length; i++)
            {
                Integer num= new Integer(nums1[i]);
                if(num2List.contains(num))
                {
                    System.out.println(num);
                    res.add(num);
                    num2List.remove(num);
                    
                }
            }
        }
        
        int [] resArr= new int[res.size()];
        for(int i=0; i<res.size(); i++)
        {
                resArr[i]= res.get(i);
        }
        return resArr;
    }
}