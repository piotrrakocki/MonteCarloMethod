package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long millisActualTime = System.currentTimeMillis();
        Random random = new Random();

        int amount = 1000000000;
        int points = 0;

        for (int i=0; i<amount; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distance = Math.hypot(x, y);

            if (distance <= 1) {
                points++;
            }
        }

        double area = points/(double)amount;
        double pi = area * 4;

        System.out.println("PI:");
        System.out.format("%.4f%n", pi);
        System.out.println("Number of points:");
        System.out.println(points);

        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("execution time = " + executionTime/1000 + "[s]");
    }
}