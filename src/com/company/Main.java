package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(self(generateRandomAge(),19));
        System.out.println(self(generateRandomAge(), 14));
        System.out.println(self(generateRandomAge(),15));
        System.out.println(self(generateRandomAge(),25));
        System.out.println(self(generateRandomAge(),14));


    }

    public static String self(int someonesAge, int temperature) {
        if (someonesAge >= 20 && someonesAge <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        }else if (someonesAge <= 20 && temperature < 0 && temperature > 28) {
            return "Можно do fi$ting a$$";
        } else if(someonesAge >=45 && temperature < -10 && temperature >25) {
            return "Можно идти в gym ";
        } else
            return "Оставайтесь дома";



        }

    public static int generateRandomAge() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(45);
        return randomNumber;

        }
    }









