package String;

import java.util.Stack;

/**
 * @author Donald
 * @data 27/05/2020 13:53
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("([]){"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if("({[".contains(String.valueOf(c))){
                stack.push(c);
            }else{
                if(!stack.empty()&&is_valid(stack.peek(),c)){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean is_valid(char c1,char c2){
        return (c1 =='(' && c2==')') || (c1 == '{' && c2=='}')||(c1=='['&&c2==']');
    }


    public static boolean isValid2(String s){
        Stack<Character>stack  =  new Stack<>();
        for(Character c: s.toCharArray()){
            if("({[".contains(String.valueOf(c))){
                stack.push(c);
            }
            if(c==')'){
                if(!stack.isEmpty()&&stack.pop()!='('){
                    return false;
                }
            }
            if(c=='}'){
                if(!stack.isEmpty()&&stack.pop()!='{'){
                    return false;
                }
            }
            if(c==']'){
                if(!stack.isEmpty()&&stack.pop()!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
