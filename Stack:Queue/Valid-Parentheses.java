class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> validStack = new Stack<>(); 
        HashMap<Character, Character> braces= new HashMap<>(); 
        braces.put('(', ')');
        braces.put('{', '}');
        braces.put('[', ']');
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(c=='{' || c=='(' || c== '[')
                validStack.push(c);
            else
            {
                if(validStack.size()==0)
                    return false;
                if(braces.get(validStack.peek())== c)
                    validStack.pop();
                else
                    return false;
            }
        }
        
        if(validStack.size()==0)
            return true; 
        else
            return false;

       
    }
}