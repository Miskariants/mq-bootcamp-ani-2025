//Number Sign & Parity – Print "Positive‑Even", "Positive‑Odd", "Negative‑Even", etc.
public class Problem15_NuberSignAndParity {
    public static void main(String[] args) {
        int number = 0;
        if (number >= 0 && number % 2 == 0) {
            System.out.println("Positive-even");
        }
        else if (number >= 0 && number % 2 == 1){
            System.out.println("Positive-odd");
        }
        else if (number < 0 && number % 2 == 0){
            System.out.println("Negative-even");
        }
        else if (number < 0 && number % 2 != 0){
            System.out.println("Negative-odd");
        }
    }
}