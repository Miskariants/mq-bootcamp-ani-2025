////3. **Mystery Animal Noise** – Pick a number 0-3; 0: `"Woof"`, 1: `"Meow"`, 2: `"Moo"`, 3: `"Quack"`.import java.util.Random;
import java.util.Random;
public class Problem3_MysteryAnimalNoise {
    public static void main(String[] args) {


    Random random = new Random();
    int noise = random.nextInt(4);
        System.out.println("My random number is " + noise);
    if (noise == 0){
        System.out.println("Woof!");
    }else if (noise == 1){
        System.out.println("Meow");
    }else if (noise == 2){
        System.out.println("Moo!");
    }else if (noise == 3){
        System.out.println("Quack!");
    }

}
}