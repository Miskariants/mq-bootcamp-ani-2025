//1. **Lucky Dice** – Roll `int roll = rnd.nextInt(6) + 1;` → print `"Lucky!"` if 6, else the roll value.

import java.util.Random;

public class Problem1_LuckyDice {
    public static void main(String[] args) {
        Random rnd = new Random();
        int roll = rnd.nextInt(6) + 1;
        System.out.println("My roll is " + roll);

        if (roll == 6) {
            System.out.println("Lucky!");
        } else {
            System.out.println(roll);
        }
    }
}
