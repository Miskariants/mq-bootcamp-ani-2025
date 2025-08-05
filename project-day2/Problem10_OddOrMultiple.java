//Odd OR Multiple of 5 – Print "Special" if number is odd || divisible by5.
public class Problem10_OddOrMultiple {
    public static void main(String[] args) {
        int number = 8;
        if (number % 2 != 0 || number % 5 == 0) {
            System.out.println("special");
        }
    }
}
