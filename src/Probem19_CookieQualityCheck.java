import java.util.Random;

//19. **Cookie Quality Check** – Random crispiness 0-10; if 4-6 `"Perfect"`, else if <4 `"Too soft"`, else `"Burnt"`.
public class Probem19_CookieQualityCheck {
    public static void main(String[] args) {
        Random rand = new Random();
        int crispiness = rand.nextInt(11);
        System.out.println(crispiness);
        if (crispiness >= 4 && crispiness <= 6) {
            System.out.println("Perfect");
        } else if (crispiness < 4) {
            System.out.println("Too Soft");
        } else {
            System.out.println("Burnt");
        }
    }
}
