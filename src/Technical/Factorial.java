package Technical;

public class Factorial {
    public static void main(String[] args) {
       /* int n = 5,fact =1;
        for(int i=fact;i<=n ;i++){
            fact*=i;
        }
        System.out.println(fact);*/

        System.out.println(fact(5));
    }
    public static int fact(int n) {
        if(n==1|| n==0) {
        return 1;
        }
       return  n*fact(n-1);

    }
}
