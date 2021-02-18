package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Country {




    //Create a class called Country
    //Fields:
    //String name, double size, int numberOfCitizens, String continent
    //Ctor:
    //with all parameters
    //Functions:
    //printCountrySize()
    //printSizePerCitizen()
    //ToString()

    String name;
    double size;
    int numberOfCitizens;
    String continent;




    public void printCountrySize(){
        System.out.println(String.format("size of country is: %d", size));
    }
    public void printSizePerCitizen(){
        System.out.println(String.format("size per citizens is: %d",size/ numberOfCitizens ));

    }
}
