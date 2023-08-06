public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int k = 7 - i;
            for (int j = 1; j <= 7; j++) {
                if (j <= 8 - i) {
                    System.out.print(" " + k);
                    k--;
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
