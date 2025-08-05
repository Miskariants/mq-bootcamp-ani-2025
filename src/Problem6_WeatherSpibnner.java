//6. **Weather Spinner** – 0-3 → `"Sunny"`, `"Rainy"`, `"Snowy"`, `"Windy"`; if `"Snowy"` print `"Build a snowman!"`.

import java.util.Random;

public class Problem6_WeatherSpibnner {
    public static void main(String[] args) {

        Random rand = new Random();

        int weather = rand.nextInt(4);

        if (weather == 0) {
            System.out.println("sunny");
        } else if (weather == 1) {
            System.out.println("rainy");
        } else if (weather == 2) {
            System.out.println("snowy");
            System.out.println("Build a Snowman!");
        } else if (weather == 3) {
            System.out.println("windy");
        }

    }
}
