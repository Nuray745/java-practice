package org.ironhack.envsetup;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }

        // Print the reversed array
        for (int number : reversedArray) {
            System.out.println(number);
        }
        // Output: 5 4 3 2 1 (each on its own line)
    }
}
