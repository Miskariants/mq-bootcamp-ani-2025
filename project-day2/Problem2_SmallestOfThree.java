//Smallest of Three – Given three ints, print the smallest.
public class Problem2_SmallestOfThree {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 4;
        int number3 = -33;
        if (number1 < number2 && number1 < number3) {
            System.out.println(number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println(number2);
        } else if (number3 < number1 && number3 < number2) {
            System.out.println(number3);
        }
    }
}
