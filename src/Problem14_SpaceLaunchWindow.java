import java.util.Random;

//14. **Space Launch Window** – Random minute 0-59; if minute<15 print `"Launch now!"` else `"Hold launch"`.
public class Problem14_SpaceLaunchWindow {
    public static void main(String[] args) {
        Random rand = new Random();
        int minute = rand.nextInt(60);
        System.out.println(minute);
        if (minute < 15) {
            System.out.println("Launch Now!");
        } else {
            System.out.println("Hold Launch");
        }
    }
}
