import java.util.Random;

//17. **Zombie Dice Duel** – Roll two dice; if both 6 print `"Zombie wins"`, else `"You escape"`.
public class Problem17_ZombieDiceDuel {
    public static void main(String[] args) {
        Random rand = new Random();
        int roll1 = rand.nextInt(1, 7);
        int roll2 = rand.nextInt(1, 7);
        System.out.println("Roll 1 = " + roll1);
        System.out.println("Roll 2 = " + roll2);
        if (roll1 == 6 && roll2 == 6) {
            System.out.println("Zombie Wins");
        } else {
            System.out.println("You Escape");
        }
    }
}
