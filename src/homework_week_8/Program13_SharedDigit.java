package homework_week_8;

public class Program13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 < 10 || number1 > 99) && (number2 < 10 || number2 > 99)) {
            return false;
        }

        int numberOneFirstDigit = number1 / 10;
        int numberTwoFirstDigit = number2 / 10;
        int numberOneLastDigit = number1 % 10;
        int numberTwoLastDigit = number2 % 10;

        if (numberOneFirstDigit == numberTwoFirstDigit || numberOneFirstDigit == numberTwoLastDigit || numberOneLastDigit == numberTwoLastDigit) {
            return true;
        } else {
            return false;
        }
    }
}

