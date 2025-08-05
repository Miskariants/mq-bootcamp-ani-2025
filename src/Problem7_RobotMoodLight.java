import java.util.Random;

//7. **Robot Mood Light** – Random RGB 0-255 each; if red>200 && blue>200 print `"Magenta Bot"` else `"Regular Bot"`.
public class Problem7_RobotMoodLight {
    public static void main(String[] args) {
        Random rand = new Random();

        int red = rand.nextInt();
        int blue = rand.nextInt();

        if (red > 200 && blue > 200) {
            System.out.println("Magenta bot");
        } else {
            System.out.println("Regular bot");
        }
    }
}
