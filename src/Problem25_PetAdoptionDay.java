import java.util.Random;

//25. **Pet Adoption Day** – Random species choose dog/cat/rabbit; if rabbit `"Hop home!"`.

public class Problem25_PetAdoptionDay {
    public static void main(String[] args) {
        Random rand = new Random();
        int animal = rand.nextInt(3);
        if (animal == 0) {
            System.out.println("Dog");
        } else if (animal == 1) {
            System.out.println("Cat");
        } else if (animal == 2) {
            System.out.println("Rabbit");
            System.out.println("Hop Home!");
        }
    }
}
