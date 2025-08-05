import java.util.Random;

//11. **Superhero Assignment** – 0-4 choose `"Fly"`, `"Strength"`, `"Invisibility"`, `"Speed"`, `"Water-Breath"`; if `"Fly"` print `"Sky patrol!"`.
public class Problem11_SuperheroAssignment {
    public static void main(String[] args) {
        Random rand = new Random();
        int ability = rand.nextInt(5);
        System.out.println(ability);
        if (ability == 0) {
            System.out.println("Fly");
            System.out.println("Sky Patrol!");
        } else if (ability == 1) {
            System.out.println("Strength");
        } else if (ability == 2) {
            System.out.println("Invisibility");
        } else if (ability == 3) {
            System.out.println("Speed");
        } else if (ability == 4) {
            System.out.println("Water-Breathing");
        }


    }
}
