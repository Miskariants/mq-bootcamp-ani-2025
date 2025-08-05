import java.util.Random;

//10. **Wizard Spell Failure** – 0-9; if even `"Spell fizzles"`, else `"Spell succeeds!"`.
public class Problem10_WizzardSpellFailure {
    public static void main(String[] args) {

        Random rand = new Random();

        int number = rand.nextInt(1, 10);
        if (number % 2 == 0) {
            System.out.println(number);
            System.out.println("Spell Fizzles");
        } else {
            System.out.println(number);
            System.out.println("Spell succeeds!");
        }


    }
}
