class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount= new HashMap<>(); 
        
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(charCount.containsKey(c))
                charCount.put(c, charCount.get(c) + 1);
            else
                charCount.put(c, 1);
                
        }
        int min=Integer.MAX_VALUE;
        for(Character c: charCount.keySet())
        {
                if(charCount.get(c)==1)
                {
                    min= Math.min(min, s.indexOf(c));
                }
        }
        if(min!=Integer.MAX_VALUE)
            return min;
        else
            return -1;
    }
}