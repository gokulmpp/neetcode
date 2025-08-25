package array;

import java.util.Stack;

public class validparenthesis {
    public static void main(String[] args) {
       String s="{[()]}";
        System.out.println(validparen(s));
    }
    public static boolean validparen(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                st.push(c);
            }
            else if(c=='}'||c==']'||c==')'){
                if(st.isEmpty()) return false;
                if(c=='}'&&st.pop()!='{'||c==']'&&st.pop()!='['||c==')'&&st.pop()!='(')
                    return false;
            }

        }return st.isEmpty();
    }
}
