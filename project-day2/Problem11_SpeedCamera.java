//Speed Camera – int speed; <60 "OK", 60‑80 "Warning", >80 "Ticket".
public class Problem11_SpeedCamera {
    public static void main(String[] args) {
        int speed = 455;
        if (speed < 60) {
            System.out.println("OK");
        } else if (speed > 60 && speed < 80) {
            System.out.println("Warning");
        } else if (speed >= 80) {
            System.out.println("Ticket!");
        }
    }
}
