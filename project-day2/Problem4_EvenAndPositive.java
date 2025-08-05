//Even & Positive – Print "Even‑Positive" only if a number is both even and>0.
public class Problem4_EvenAndPositive {
    public static void main(String[] args) {
        int number = 9;
        if (number % 2 == 0 && number > 0) {
            System.out.println("Even-Positive");
        } else {
            System.out.println("No. Sorry");
        }
    }
}
