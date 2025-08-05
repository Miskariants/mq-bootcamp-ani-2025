import java.util.Random;

//23. **Robot Battery Roll** – Percent 0-100; 0-20 `"Red"`, 21-60 `"Yellow"`, else `"Green"`.
public class Problem23_RobotBatteryRoll {
    public static void main(String[] args) {
        Random rand = new Random();
        int percent = rand.nextInt(101);
        if (percent >= 0 && percent <= 20) {
            System.out.println("Red");
        } else if (percent >= 21 && percent <= 60) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
}
