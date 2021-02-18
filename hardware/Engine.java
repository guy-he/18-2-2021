package com.company.hardware;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Engine {
     public String name;
     public int size;
     private double miles;
     private int model_number;
     int number_of_cyl;
     public  void runEngine(double more_miles ){
         miles += more_miles;
     }

     public boolean doesEngineneedsRestart(){
         if (miles > miles_per_restart){
             return true;
         }
         else return false;
     }
     private static final double miles_per_restart = 9000;

}
