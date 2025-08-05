import java.util.Random;
public class Project21_TriangleType {
    public static void main(String[] args) {
    int side1 = 4;
    int side2 = 34;
    int side3 = 55;
    if (side1 == side2 && side1 == side3){
        System.out.println("Equilateral");
    }
    else if (side2 == side1 || side2 == side3 || side1 == side3){
        System.out.println("Isosceles");
    }
    else {
        System.out.println("Scalene");
    }

    }
}
