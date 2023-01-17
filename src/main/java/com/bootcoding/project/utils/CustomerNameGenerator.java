package com.bootcoding.project.utils;

import java.util.Random;

public class CustomerNameGenerator {
    private static final String[] CUSTOMER_NAMES = {
            "sujal", "sarang", "aman", "aryan", "sumit", "kunal"};


    private static Random random = new Random();

    public static String getName() {
        int randomIndex = random.nextInt(CUSTOMER_NAMES.length);

         return CUSTOMER_NAMES[randomIndex];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(CustomerNameGenerator.getName());
        }
    }
}
