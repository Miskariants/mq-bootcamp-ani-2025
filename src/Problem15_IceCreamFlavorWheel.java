import java.util.Random;

//15. **Ice Cream Flavor Wheel** – 0-5 pick flavors; if `"Chocolate"` AND rnd.nextBoolean() true print `"Double scoop!"`.
public class Problem15_IceCreamFlavorWheel {
    public static void main(String[] args) {

        Random rand = new Random();
        int flavor = rand.nextInt(6);
        boolean chocolatte = rand.nextBoolean();
        System.out.println(flavor);
        System.out.println(chocolatte);
        if (flavor == 3 && chocolatte == true) {
            System.out.println("Double Scoop");
        } else {
            System.out.println("Regular Scoop");
        }
    }
}
