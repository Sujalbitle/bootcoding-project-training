package com.bootcoding.project.utils;

import java.util.Random;

public class PriceGenerator {
    static Random random=new Random();
    static final int Max=1000;
    static final int MIN=100;
    public static int PriceList(){

        return MIN+random.nextInt(Max-MIN);
    }
    public static void main(String args[]){
        int price=PriceGenerator.PriceList();
        System.out.println(price);
    }
}
