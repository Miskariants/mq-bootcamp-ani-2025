//2. **Coin-Flip Cheer** – `boolean heads = rnd.nextBoolean();` → heads `"Woo-hoo!"`, tails `"Darn!"`.

import java.util.Random;

public class Problem2_CoinFlipCheer {
    public static void main(String[] args) {
        Random random = new Random();
        boolean value = random.nextBoolean();
        if (value == random.nextBoolean()) {
            System.out.println("Woo-hoo!");
        } else {
            System.out.println("Darn!");
        }

    }
}
