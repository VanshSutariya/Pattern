/*
create the pattern:

          0          
         121         
        23432        
       3456543       
      456787654      
     56789098765     
    6789012109876    
   789012343210987   
  89012345654321098  
 9012345678765432109 
012345678909876543210
 9012345678765432109 
  89012345654321098  
   789012343210987   
    6789012109876    
     56789098765     
      456787654      
       3456543       
        23432        
         121         
          0          

*/

public class Pattern21 {
    public static void main(String[] args) {
        int k = 0;
        int x = 1;
        for (int i = 1; i <= 21; i++) {
            if (i < 12) {
                k++;
            } else {
                k--;
            }
            x = k - 1;
            for (int j = 1; j <= 21; j++) {
                if (j >= 12 - k && j <= 10 + k) {

                    if (j >= 11) {
                        System.out.print(x % 10);
                        x--;
                    } else {
                        System.out.print(x % 10);
                        x++;

                    }
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
