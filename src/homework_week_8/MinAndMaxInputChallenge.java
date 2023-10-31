package homework_week_8;
//-Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has enterd.

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstNumber = true;

        while(true) {
            System.out.println("Enter number:");

            boolean validateNumber = scanner.hasNextInt();
            if(validateNumber) {
                int number = scanner.nextInt();

                if(firstNumber) {
                    min = number;
                    max = number;
                    firstNumber = false;
                }
                if(number < min) {
                    min = number;
                }
                if(number > max) {
                    max = number;
                }

            } else {
                break;
            }
        }
        scanner.close();

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }

}

