import java.util.Random;

//9. **Treasure Map Row** – Random row 1-5; if row 3 print `"X marks the spot"` else `"Keep walking"`.
public class Problem9_TreasureMapRow {
    public static void main(String[] args) {

        Random rand = new Random();

        int row = rand.nextInt(1, 6);

        if (row == 3) {
            System.out.println(row);
            System.out.println("X Marks The Spot!");
        } else {
            System.out.println(row);
            System.out.println("Keep Walking.");
        }


    }
}
