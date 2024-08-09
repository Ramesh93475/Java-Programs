import java.util.Scanner;

class Hi {
    public static void main(String args[]) {
        int i, j, n;
        int[] ar;
        ar = new int[100];
        Scanner s = new Scanner(System.in);
        int r = 0;
        n = s.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        for (i = 0; i < n; i++) {
            int c = 0;
            for (j = 0; j < n; j++) {
                if (ar[i] == ar[j]) {
                    c += 1;
                }
            }
            if (c % 2 != 0) {
                r += 1;
            }
        }
        System.out.println(r);
    }
}
