import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter I/P: ");
        int n = sc.nextInt();
        if (n <= 2)
            System.out.println(n);
        int prev2 = 1;
        int prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int curr= prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        System.out.println(prev1);
    }
}
