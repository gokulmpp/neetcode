package Technical;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        System.out.println(st);
    }
}
