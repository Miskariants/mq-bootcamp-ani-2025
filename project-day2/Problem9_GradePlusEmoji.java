//Grade + Emoji – Add 😊 for A/B, 😐 for C/D, 😢 for F.
public class Problem9_GradePlusEmoji {
    public static void main(String[] args) {
        int grade = 39;
        if (grade <= 100 && grade >= 90) {
            System.out.println("Current Grade: 90 ~ 100     Excellent!");
            System.out.println(":DDDDD");
        } else if (grade < 90 && grade >= 70) {
            System.out.println("Current Grade: 70 ~ 90     You did well");
            System.out.println(":)))))");
        } else if (grade < 70 && grade >= 50) {
            System.out.println("Current Grade: 50 ~ 70     Do better");
            System.out.println("://///");
        } else if (grade < 50 && grade >= 0) {
            System.out.println("Current Grade: 0 ~ 50   You FAILED, Kid.");
            System.out.println(">:(((((");
        }
    }
}
