package com.bootcoding.project.utils;

import java.util.Random;

public class phoneNumberGenerator {
    static Random random=new Random();
    static final int Max=999999999;
    static final int Min=500000000;

    public static long getMobNumber(){
        return Min+random.nextInt( Max-Min);

    }
    public static void main(String[] args) {
        long Number= phoneNumberGenerator.getMobNumber();
        System.out.println(Number);
    }
}
