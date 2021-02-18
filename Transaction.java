package com.company;

import java.util.Date;

public class Transaction {
    public final Date creationTime;
    public final int amount;
    public static int amountcount = 0;
    public  static  int amountsum = 0;



    public static double avg(){
        return (double)amountsum / amountcount;
    }

    public Transaction(int amount) {
        this.amount = amount;
        this.creationTime = new Date();
         amountcount++;
         amountsum += amount;

    }


}
