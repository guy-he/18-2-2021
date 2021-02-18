package com.company;

import lombok.ToString;

@ToString
public class SamsungMobile {
    public SamsungMobile(String color, float size, float current_os) {
        this.color = color;
        this.size = size;
        this.current_os = latest_os_num;
    }

    /*
        SamsungMobile class
        lombok @tostring
        String color
        float size
        float current_os
        static float lastest_android_os_number = 4.4;
        static method which add 0.1 to os number
        regular method (non-static) which sets the current_os to the latest_android_os_number
        in the ctor set the current_os to the static latest_android_os_number*/
public String color;
public float size;
public float current_os;
public static float latest_os_num = 4.4f;



}
