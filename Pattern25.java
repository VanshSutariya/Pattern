/*
Create the pattern:
    A
   CB
  FED
 JIHG
ONMLK

*/

public class Pattern25 {
    public static void main(String[] args) {
        int k = 64, p;
        for (int i = 1; i <= 5; i++) {
            k = k + i;
            p = k;
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - i) {
                    System.out.print((char) p);
                    p--;

                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
