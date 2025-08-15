package array;
import java.util.*;

public class SubString {
    public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            ArrayList<String> str=new ArrayList<>();
            int i=0;
           while(i<=(s.length()-k)){
                String st=s.substring(i,i+k);
                i++;
                str.add(st);
            }
        Collections.sort(str);
        System.out.println(str);
            smallest = str.get(0);
            largest = str.get(str.size()-1);
            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }

