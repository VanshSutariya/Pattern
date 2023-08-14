/*
create the pattern:
A   
BA  
CBA 
DCBA
*/

public class Pattern22 {
    public static void main(String[] args) {
        int k = 64;
        for (int i = 1; i <= 4; i++) {
            int x = k + i;
            for (int j = 1; j <= 4; j++) {
                if (j <= i) {
                    if (j == 1) {
                        System.out.print((char) x);
                    } else {
                        x--;
                        System.out.print((char) x);
                    }

                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}
