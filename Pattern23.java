/*
create the pattern:
   1   
  212  
 32123 
4321234
*/
public class Pattern23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int x = i;
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j >= 4) {
                        System.out.print(x);
                        x++;
                    } else {
                        System.out.print(x);
                        x--;
                    }
                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
