package array;

public class validparenthesis {
    public static void main(String[] args) {
       String s="{[()]}";
        System.out.println(validparenthesis(s));
    }
    public static boolean validparenthesis(String s) {
        while(true) {
            if(s.contains("()"))
            {
                s=s.replace("()","");
            }
            else if(s.contains("[]"))
            {
                s=s.replace("[]","");
            }
            else if(s.contains("{}"))
            {
               s= s.replace("[]","");
            }
            else {
                return s.isEmpty();
            }
        }
    }
}
