import java.util.Random;

//16. **Dragon Egg Hatch** – Chance number 0-99; if <5 print `"Dragon hatches!"` else `"Egg is quiet."`
public class Problem16_DragonEggHatch {
    public static void main(String[] args) {
        Random rnd = new Random();
        int chance = rnd.nextInt(100);
        if (chance < 5) {
            System.out.println("Dragon Hatches!");
        } else {
            System.out.println("Egg is Quiet");
        }
    }
}
