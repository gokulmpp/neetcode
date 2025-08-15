package array;

import java.io.Serializable;

public class Account implements Serializable {
    String accNo;
    String name;
    double balance;
    Account() {}
    Account(String a,String n,double b) {
        accNo = a;
        name = n;
        balance = b;
    }
    public String toString()
    {
        return "Account No:"+accNo+"\nName:"+name+"\nbalance"+balance;
    }
}
