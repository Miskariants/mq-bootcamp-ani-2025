import java.util.Random;

//18. **Rainbow Unicorn Finder** – rnd.nextInt(1000); if equals 777 print `"Unicorn found!"` else `"Keep searching"`.
public class Problem18_RainbowUnicornFinder {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(1000);
        System.out.println(number);
        if (number == 777) {
            System.out.println("Unicorn Found");
        } else {
            System.out.println("Keep Searching");
        }
    }
}
