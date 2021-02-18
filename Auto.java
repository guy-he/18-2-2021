package com.company;

public class Auto {
     public String model;
     public String platNumber;
     private float km;
     private String ownerName;
     private static int cars = 0;

     public String getOwnerName(){
          return ownerName;
     }

    public Auto(String model, String platNumber, float km, String ownerName) {
        this.model = model;
        this.platNumber = platNumber;
        this.km = km;
        this.ownerName = ownerName;
        cars++;
    }

    public int getCars(){
         return cars;
     }
}
