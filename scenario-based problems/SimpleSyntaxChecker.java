interface SyntaxChecker {
    boolean isBalanced(String code);
}

class SimpleSyntaxChecker implements SyntaxChecker {
    public boolean isBalanced(String code) {
        Stack<Character> stack = new Stack<>();
        for (char c : code.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
