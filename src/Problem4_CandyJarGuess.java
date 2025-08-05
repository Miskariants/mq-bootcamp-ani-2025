//4. **Candy Jar Guess** – Random candies 10-30; if > 20 print `"Sugar Rush!"` else `"Moderate snack."`
import java.util.Random;
public class Problem4_CandyJarGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(10, 30);
        if (randomnumber > 20) {
            System.out.println("Sugar Rush!");
        } else {
            System.out.println("Moderate Snack");
        }
    }
}
