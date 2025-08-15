package Technical;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String s= st.toString();
        if(str.equals(s)){
            System.out.println("yes palindrome");
        }
    }
}
