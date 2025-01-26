public class SignChecker {
    public static void main(String[] args) {
        double x = 49;
        if (x > 0) {
            System.out.printf("The given number %.1f is a positive number!", x);
        } else if (x == 0) {
            System.out.println("Zero is neither");
        } else {
            System.out.println(x + " is negative");
        }
    }
}
