class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> magazineMap= new HashMap<>();
        for(int i=0; i<magazine.length(); i++)
        {
            char c= magazine.charAt(i);
            if(magazineMap.containsKey(c))
                magazineMap.put(c, magazineMap.get(c) + 1);
            else
                magazineMap.put(c, 1);
        }
        for(int i=0; i<ransomNote.length(); i++)
        {
            char c= ransomNote.charAt(i);
            if(magazineMap.containsKey(c))
            {
                magazineMap.put(c, magazineMap.get(c)-1);
                if(magazineMap.get(c)==-1)
                    return false;
            }
            else if (!magazineMap.containsKey(c))
                return false;
            
        }
        return true; 
        
            
    }
}