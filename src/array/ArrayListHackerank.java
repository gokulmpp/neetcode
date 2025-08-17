package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHackerank {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> line = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int lin = sc.nextInt();

        for(int i =0;i<lin;i++){
            int a = sc.nextInt();
            ArrayList<Integer> rows = new ArrayList<>();
            rows.add(a);
            for(int j=0;j<a;j++){
                int b = sc.nextInt();
                rows.add(b);
            }
            line.add(rows);

        }
        System.out.println(line);
        System.out.println(line.size());
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            int y= sc.nextInt();
            try{
                System.out.println(line.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

    }

}
