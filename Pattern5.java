/*
Create this pattern:

    1    
   121
  12321
 1234321
123454321

*/

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= 9; j++) {
                if (j >= 6 - i && j <= 4 + i) {

                    if (j >= 5) {
                        System.out.print(k);
                        k--;
                    } else {
                        System.out.print(k);
                        k++;
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
