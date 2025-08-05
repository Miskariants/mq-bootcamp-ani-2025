import java.util.Random;

//22. **Martian Weather Suit** – Temp -60 to 20; if temp<-30 `"Wear heater suit"` else `"Standard suit"`.
public class Problem22_MartianWeatherSuit {
    public static void main(String[] args) {
        Random rand = new Random();
        int temp = rand.nextInt(-60, 20);
        if (temp < -30) {
            System.out.println("Wear Heater Suit");
        } else {
            System.out.println("Standard Suit");
        }
    }
}
