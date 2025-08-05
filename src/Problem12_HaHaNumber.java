import java.util.Random;

//12. **Ha-Ha Number** – Random int 1-100; if multiple of 11 print `"Ha-ha!"` else the number
public class Problem12_HaHaNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1, 101);
        if (number % 11 == 0) {
            System.out.println(number);
            System.out.println("Ha-Ha!");
        } else {
            System.out.println(number);
        }
    }
}