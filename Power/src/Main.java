//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double power = myPow(2, -3);
        System.out.println(power);
    }

    public static double myPow(double x, int n) {
        long N = n;
        double result = 1.0;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        while (N > 0) {
            if ((N%2) == 1) result *= x;
            x*=x;
            N=N/2;
        }
        return result;
    }
}
