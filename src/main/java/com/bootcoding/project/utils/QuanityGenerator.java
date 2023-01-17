package com.bootcoding.project.utils;

import java.util.Random;

public class QuanityGenerator {
    static Random random=new Random();
    static final int Max=10;
    static final int MIN=1;
    public static int QuantityNumber(){

        return MIN+random.nextInt(Max-MIN);
    }
    public static void main(String args[]){
        int quantity=QuanityGenerator.QuantityNumber();
        System.out.println(quantity);
    }
}
