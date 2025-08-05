//Leap Year Pro – int year = 2024; print "Leap" if divisible by4 and (!divisible by100||divisible by400).
public class Problem5_LeapYearPro {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
