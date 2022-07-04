package com.bridgelabz.basics.deme1;

public class Windchill {
    public static void main(String[] args) {
        double t = 5.0;
        double v = 3.6;
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}


