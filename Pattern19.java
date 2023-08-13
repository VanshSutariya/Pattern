/*
create the pattern:
1       
10      
101     
1010    
10101   
101010  
*/

public class Pattern19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j <= i) {
                    if (j % 2 == 0)
                        System.out.print(0);
                    else
                        System.out.print(1);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
