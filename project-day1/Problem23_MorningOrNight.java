//Morning or Night – int hour = 18; – Print Good morning or Good night.
public class Problem23_MorningOrNight {
    public static void main(String[] args) {
        int hr = 7;
        if (hr <= 12 && hr > 6) {
            System.out.println("Good Morning");
        } else if (hr >= 20 && hr <= 24) {
            System.out.println("Good Night");
        }
    }
}
