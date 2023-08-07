public class Pattern15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            char k;
            k = 'A';
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j >= 4) {
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
