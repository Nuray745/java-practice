package org.ironhack.envsetup;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 3};

        // =========================
        // Exercise 1
        // =========================

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int difference = max - min;
        System.out.println("Difference between max and min: " + difference);


        // =========================
        // Exercise 2
        // =========================

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
