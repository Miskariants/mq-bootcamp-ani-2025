import java.util.Random;

//24. **Magic Potion Mix-Up** – Random color char `'R','G','B'`; combine two randoms – red+blue prints `"Purple!"`.
public class Problem24_MagicPotionMixUp {
    public static void main(String[] args) {
        Random rand = new Random();
        int color1 = rand.nextInt(3);
        int color2 = rand.nextInt(3);
        System.out.println(color1 + " " + color2);
        if (color1 == 0 && color2 == 0) {
            System.out.println("Red");
        } else if (color1 == 1 && color2 == 1) {
            System.out.println("Green");
        } else if (color1 == 2 && color2 == 2) {
            System.out.println("Blue");
        } else if ((color1 == 0 && color2 == 2) || (color2 == 0 && color1 == 2)) {
            System.out.println("Purple!");
        }
    }
}
