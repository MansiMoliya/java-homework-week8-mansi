package homework_week_8;

public class Program11_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int total = 0;
        int qwert;
        if(number>0){
            while(number!=0){
                qwert =  number % 10;
                if(qwert % 2 == 0){
                    System.out.println(qwert + " is a even digit");
                    total = total + qwert;
                }
                number = number / 10;
            }
            return total;
        }
        return -1;
    }
}
