import java.util.*;

public class Pattern29 {
    public static void main(String[] args) {
        System.out.println("enter here:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            for (; j <= 2 * i; j++) {
                if (j % 2 != 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
