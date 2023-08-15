/*
Create the pattern:
   *
  * *
 * * *
* * * *

*/

public class Pattern27 {
    public static void main(String[] args) {
        int k = 0;
        int flag = 1;
        for (int i = 1; i <= 7; i++) {
            if (i < 4 - k) {
                System.out.print(" ");
            } else {
                if (flag == 1) {
                    System.out.print("*");
                    flag = 0;
                } else {
                    System.out.print(" ");
                    flag = 1;
                }
            }
            if (i == 4 + k) {
                k++;
                System.out.println();
                if (i == 7) {
                    break;
                }
                i = 0;
                flag = 1;
            }
        }
    }
}
