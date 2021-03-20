
public class Nestedlf2 {
    public static void main(String[] args) {
        
        final int LOWERBOUD = 1;
        final int UPPERBOUD = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        
        int number = LOWERBOUD;
        while (number <= UPPERBOUD) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            ++number;
        }
        if (sumOdd > sumEven){
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        System.out.println("The sum of odd numbers from" + LOWERBOUD + " to "
            + UPPERBOUD + " is "
            + sumOdd);
        System.out.println("The sum of even numbers from" + LOWERBOUD + " to "
            + UPPERBOUD + " is "
            + sumOdd);
        System.out.println("The absolute difference the two sums is; " + absDiff);
    }
}
