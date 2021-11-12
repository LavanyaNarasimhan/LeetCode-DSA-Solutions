class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> sMap= new HashMap<>();
        if(s.length()!= t.length())
        {
            return false;
        }
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(sMap.containsKey(c))
                sMap.put(c, sMap.get(c) + 1);
            else
                sMap.put(c, 1);
        }
        for(int i=0; i<t.length(); i++)
        {
            char c= t.charAt(i);
            if(sMap.containsKey(c))
            {
                sMap.put(c, sMap.get(c) -1);
                if(sMap.get(c)==-1)
                    return false;
            }
            if(!sMap.containsKey(c))
                return false;
            
        }
        return true;
       

    }
}