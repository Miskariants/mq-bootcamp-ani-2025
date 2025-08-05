//5. **Alien Color Detector** – 0-2 → `"Green"`, `"Purple"`, `"Blue"`; if blue print `"Rare alien!"`.
public class Problem5_AlienColorDetector {
    public static void main(String[] args) {
        int number = 2;
        if (number == 0) {
            System.out.println("Green Alien");
        } else if (number == 1) {
            System.out.println("Purple Alien");
        } else if (number == 2) {
            System.out.println("Rare Blue Alien!!!");
        }
    }
}
