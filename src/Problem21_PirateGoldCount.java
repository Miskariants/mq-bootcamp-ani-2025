import java.util.Random;

//21. **Pirate Gold Count** – Coins 0-99; if coins>50 OR coins%13==0 print `"Yarr, rich!"`.
public class Problem21_PirateGoldCount {
    public static void main(String[] args) {
        Random rand = new Random();
        int coins = rand.nextInt(100);
        if (coins > 50 || coins % 13 == 0) {
            System.out.println("Yarr, Rich!");
        } else {
            System.out.println("Narr, Poor!");
        }
    }
}
