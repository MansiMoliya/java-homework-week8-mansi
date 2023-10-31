package homework_week_8;

public class Program7_Sum {

    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
      //  System.out.println("sumFirstAndLastDigit: ");
      //  int number=sc.nextInt();
       // System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
    public static int sumFirstAndLastDigit(int number){
        int mod = 0;
        int firstdivide = 0;
        int seconddivide = 0;
        int sum = 0;

        if (number < 0) {
            return -1;
        } else if (number > 0 && number < 10) {
            return number + number;
        } else if (number >= 10 && number < 100) {
            mod = number % 10;
            firstdivide = number / 10;
            sum = mod + firstdivide;

            return sum;
        }

        while (number > 0) {
            mod = number % 10;
            firstdivide = number / 10;
            seconddivide = firstdivide / 10;
            sum = mod + seconddivide;
            break;
        }
        return sum;
    }
}
