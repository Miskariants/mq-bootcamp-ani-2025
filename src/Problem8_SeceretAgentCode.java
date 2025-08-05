import java.util.Random;
//8. **Secret Agent Code** – Random 4-digit pin (1000-9999); if divisible by 7 print `"Ultra secure"`.
public class Problem8_SeceretAgentCode {
    public static void main(String[] args) {

        Random rand = new Random();
        int pin = rand.nextInt(1000, 9999);

        if (pin % 7 == 0) {
            System.out.println(pin);
            System.out.println("Ultra Secure!");
        }
        else{
            System.out.println(pin);
        }


    }
}