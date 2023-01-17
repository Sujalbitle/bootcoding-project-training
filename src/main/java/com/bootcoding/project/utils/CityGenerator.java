package com.bootcoding.project.utils;

import java.util.Random;

public class CityGenerator {
    private static final String[] CityName = {
            "Nagpur", "Seoni", "Jabalpur", "Wardha", "Ramtek", "Bhandara"};

    private static Random random = new Random();

    public static String CityName(){
        int randomIndex = random.nextInt(CityName.length);

        return CityName[randomIndex];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(CityGenerator.CityName());
        }
    }
}
