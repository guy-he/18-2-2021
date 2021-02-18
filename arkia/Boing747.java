package com.company.arkia;

import com.company.hardware.Engine;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Boing747 {
    private Engine engine;
    // public fly ( double miles ) --> call runEngine
     public void fly (double miles){
         engine.runEngine(miles);
     }
}
