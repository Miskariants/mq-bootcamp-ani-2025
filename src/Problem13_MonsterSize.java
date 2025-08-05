import java.util.Random;

//13. **Monster Size** – Height 50-300 cm; <100 `"Tiny"`, 100-200 `"Medium"`, >200 `"Giant"`.
public class Problem13_MonsterSize {
    public static void main(String[] args) {
        Random rand = new Random();
        int height = rand.nextInt(50, 301);
        System.out.println(height);
        if (height < 100) {
            System.out.println("Tiny");
        } else if (height >= 100 && height <= 200) {
            System.out.println("Medium");
        } else if (height > 200) {
            System.out.println("Giant!");
        }
    }
}