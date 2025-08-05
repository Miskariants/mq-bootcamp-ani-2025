//Valid Triangle? – int a,b,c; print "Valid" if sides>0 and satisfy triangle inequality.
public class Problem6_ValidTriangle {
    public static void main(String[] args) {
        int a = 60;
        int b = 60;
        int c = 60;
        if (a + b + c == 180) {
            System.out.println("Valid!");
        }
    }
}
