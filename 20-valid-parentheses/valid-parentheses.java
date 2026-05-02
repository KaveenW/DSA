class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // 1. If it's an opening bracket, push to stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // 2. If it's a closing bracket
            else {
                // If stack is empty, there's no opening bracket to match
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                // Check for mismatches
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        // 3. If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}