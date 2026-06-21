class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');



        Stack<Character> stack = new Stack<>();

        for(char st: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(st); 
            } 
            else if(stack.peek().equals(map.get(st))){
                stack.pop();
            }else{
                stack.push(st);
            }
            // System.out.println("cheeeeeeeking "+stack.peek().equals(map.get(st)));
                
        }

    
        // System.out.println("stack "+stack);
        return stack.isEmpty();
    }
}
