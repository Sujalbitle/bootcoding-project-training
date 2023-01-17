package com.bootcoding.project.utils;

import java.util.Random;

public class OTPGenerator {
    static Random random=new Random();
     static final int MAX=99999;
     static final int MIN=10000;

    public static int getOTP(){
        return MIN+random.nextInt(MAX-MIN);
    }
    public static void main(String[] args) {
       int otp= OTPGenerator.getOTP();
        System.out.println(otp);
    }
}
