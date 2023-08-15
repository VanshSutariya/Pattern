/*
Create the Pattern:
        *
       **
      ***
     ****
    *****
    |****
*   | ***
**  |  **
*** |   *
****|
*****
****
***
**
*
*/

import java.util.*;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows which you want to print :");
        int n = sc.nextInt();
        int k;
        for (int i = 1; i <= 3 * n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i <= n) {
                    if (j >= 2 * n - i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else if (i <= 2 * n) {
                    k = 0;
                    if (j == n) {
                        k = 1;
                        System.out.print("|");
                    }
                    if (j <= i - (n + 1)) {
                        k = 1;
                        System.out.print("*");
                    }
                    if (j >= i) {
                        k = 1;
                        System.out.print("*");
                    }
                    if (k == 0) {
                        System.out.print(" ");
                    }
                } else if (i <= 3 * n) {
                    if (j <= 3 * n + 1 - i) {
                        System.out.print("*");
                    } else
                        System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
