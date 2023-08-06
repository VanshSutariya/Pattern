/*
create this pattern:
    1
   12
  123
 1234
12345
 1234
  123
   12
    1
    
*/

// public class Pattern12 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 9; i++) {
//             int k = 1;
//             if (i <= 5) {
//                 for (int j = 1; j <= 5; j++) {
//                     if (j > 5 - i) {
//                         System.out.print(k);
//                         k++;
//                     } else
//                         System.out.print(" ");
//                 }
//             } else {
//                 for (int j = 1; j <= 5; j++) {
//                     if (j >= i - 4) {
//                         System.out.print(k);
//                         k++;
//                     } else
//                         System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

// Another Method 

public class Pattern12 {
    public static void main(String args[]) {
        int k = 0;
        for (int i = 1; i <= 9; i++) // i is denoted by row.
        {
            if (i < 6) {
                k++;
            } else {
                k--;
            }
            int x = 1;
            for (int j = 1; j <= 5; j++) // j is denoted by column.
            {
                if (j >= 6 - k) {
                    System.out.print(x);
                    x++;
                } else
                    System.out.print(" ");
            }
            System.out.println(); // that is the logic of only 5 lines print.
        }
    }
}
