package Day02;

import java.util.Stack;

public class Solution20 {
    public static void main(String[] args) {
        String string = "(){}[]";
        System.out.println(isValid(string));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            switch (ch) {
                case ')' :{
                    if (stack.empty()) {
                        return false;
                    } else {
                        if (stack.peek() != '(') {
                            stack.push(ch);
                        } else {
                            stack.pop();
                        }
                        break;
                    }
                }
                case ']': {
                    if (stack.empty()) {
                        return false;
                    } else {
                        if (stack.peek() != '[') {
                            stack.push(ch);
                        } else {
                            stack.pop();
                        }
                        break;
                    }
                }
                case '}': {
                    if (stack.empty()) {
                        return false;
                    } else {
                        if (stack.peek() != '{') {
                            stack.push(ch);
                        } else {
                            stack.pop();
                        }
                        break;
                    }
                }
                default: stack.push(ch);
            }
        }
        if(stack.empty()){
            return true;
        }
        else return false;
    }
}
