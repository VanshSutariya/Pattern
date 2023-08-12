public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            char k;
            k = 'A';
            int x = 1;
            for (int j = 1; j <= 8; j++) {
                if (j >= 5 - i && j <= 4 + i) {
                    if (j <= 4) {
                        System.out.print(k);
                        k++;
                    } else {
                        System.out.print(x);
                        x++;
                    }
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
