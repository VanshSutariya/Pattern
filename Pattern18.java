/*
Create the  pattern:
   1   
  12A  
 123AB 
1234ABC

*/

public class Pattern18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int x = 1;
            char k;
            k = 'A';
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j < 5) {
                        System.out.print(x);
                        x++;
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
