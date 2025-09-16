package array;

public class isSequence {
    public boolean isSubsequence(String s, String t) {
       int i=0;
       int j=0;
       while(i<s.length()&&j<t.length()){
           if(s.charAt(i)==t.charAt(j)){
               i++;
               j++;
           }
           else j++;
       }
        return (i==s.length());
    }

    public static void main(String[] args) {
        isSequence a = new isSequence();
        String str1="abc";
        String str2="ahbgdc";
        System.out.println(a.isSubsequence(str1,str2));


    }
}
