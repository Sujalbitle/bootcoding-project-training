package com.bootcoding.project.utils;

import java.util.Random;

public class RestaurantNameGenerator {
    private static final String[] RestaurantName = {
            "Annapurna", "CandleLight", "FuelStation", "Haldiram", "MH49Dinner", "SujalSaoji"};

    private static Random random = new Random();

    public static int randomIndex = random.nextInt(RestaurantName.length);
    public static String getName(){

        return RestaurantName[randomIndex];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(RestaurantNameGenerator.getName());
        }
    }
}
