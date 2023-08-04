/*
Create this Pattern:

*   
**
***
****
***
**
*

*/

// public class Pattern8 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 7; i++) {
//             if (i < 5) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//             } else {
//                 for (int j = 1; j <= 8 - i; j++)
//                     System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class Pattern8 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 7; i++) {
            if (i <= 4) {
                k++;
            } else {
                k--;
            }

            for (int j = 1; j <= 4; j++) {
                if (j <= k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
