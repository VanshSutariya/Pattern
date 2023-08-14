/*
Create the Pattern:
1        
3*2      
4*5*6    
10*9*8*7  
11*12*13*14*15
*/

public class Pattern24 {
    public static void main(String[] args) {
        int k = 0, p;
        for (int i = 1; i <= 5; i++) {
            int x = 1;
            if (i % 2 == 1) {
                k = k + 1;
            } else {
                k--;
                k = k + i;
            }
            p = k;
            for (int j = 1; j <= 9; j++) {

                if (j <= (2 * i) - 1) {
                    if (x == 1) {
                        System.out.print(p);
                        if (i % 2 != 0) {
                            p++;
                            k++;
                        } else {
                            p--;
                        }
                        x = 0;
                    } else {
                        System.out.print("*");
                        x = 1;
                    }

                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
