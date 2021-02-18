package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Tv {



    String brand;
    String model;
    double price;
    boolean is4k;
    double size;
    int bla;

    public void showPriceAfterDiscount(){
        System.out.println(price/2);
    }


}
