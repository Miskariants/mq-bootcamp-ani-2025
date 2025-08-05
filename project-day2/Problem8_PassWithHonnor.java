//Pass with Honor – int mark; ≥90 "Honor Roll", 60–89 "Pass", else "Fail".
public class Problem8_PassWithHonnor {
    public static void main(String[] args) {
        int mark = 20;
        if (mark >= 90) {
            System.out.println("you are honor roll");
        } else if (mark > 60 && mark <= 89) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
