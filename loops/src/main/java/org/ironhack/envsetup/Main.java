package org.ironhack.envsetup;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 3};

        // Array-in uzunluğu yoxlanılır
        if (numbers.length < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }

        // =========================
        // Exercise 1
        // Difference between max and min
        // =========================

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
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
        // Smallest and second smallest
        // =========================

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            }
            else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
