import java.util.Random;

//20. **Haunted House Door** – Random door 1-3; 1 ghost, 2 candy, 3 nothing – print outcome.
public class Problem20_HauntedHouseDoor {
    public static void main(String[] args) {
        Random rand = new Random();
        int door = rand.nextInt(1, 4);
        System.out.println(door);
        if (door == 1) {
            System.out.println("Ghost");
        }else if (door == 2) {
            System.out.println("Candy");
        }else if (door == 3) {
            System.out.println("Nothing!");
        }
    }
}
