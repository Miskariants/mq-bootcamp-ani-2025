//BMI Category – double bmi; <18.5 "Under", 18.5–24.9 "Normal", else "Over".
public class Project22_BMICategory {
    public static void main(String[] args) {
        double bmi = 24.99999999999;
        if (bmi < 18.5) {
            System.out.println("Under");
        } else if (bmi >= 18.5 && bmi < 24.9){
            System.out.println("Normal");
        }
        else{
            System.out.println("Over");
        }
    }
}
