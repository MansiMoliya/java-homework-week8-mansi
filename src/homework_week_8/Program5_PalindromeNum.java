package homework_week_8;

public class Program5_PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int n) {
        if (n < 0)
            return false;

        int div = 1;
        // find the divisor
        while (n / div >= 10)
            div *= 10;

        // any number less than 10 is a palindrome
        while (n != 0) {
            int leading = n / div;
            int trailing = n % 10;
            if (leading != trailing)
                return false;

            // % with div gets rid of leading digit
            // dividing result by 10 gets rid of trailing digit
            n = (n % div) / 10;

            // got rid of 2 numbers, update div accordingly
            div /= 100;
        }
        return true;
    }
}
