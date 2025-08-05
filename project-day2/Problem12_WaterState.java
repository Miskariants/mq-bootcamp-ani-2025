//Water State – int temp; <0 "Ice", 0–99 "Liquid", ≥100 "Steam".
public class Problem12_WaterState {
    public static void main(String[] args) {
        int temp = -7;
        if (temp < 0) {
            System.out.println("Ice");
        } else if (temp > 0 && temp <= 99) {
            System.out.println("Liquid");
        } else if (temp >= 100) {
            System.out.println("Steam!");
        }
    }
}
