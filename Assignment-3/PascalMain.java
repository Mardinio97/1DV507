package km222pw_assign3;

import java.util.Arrays;
import java.util.Scanner;

public class PascalMain {
    public static void main(String[] args) {
        int n, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = scanner.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.print("Line " + i + " ----->     ");
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            String triangle = Arrays.toString(pascalRow(i)).replace(",", "").replace("[", "").replace("]", "").trim();
            System.out.print(triangle);
            System.out.println();
        }
    }

    public static int[] pascalRow(int n) {
        int[] num = new int[n + 1];
        int[] arr_rows;
        arr_rows = new int[num.length];
        num[0] = 1;
        num[n] = 1;
        if (n == 0)
            return num;
        arr_rows = pascalRow(n - 1);
        for (int i = 1; i < arr_rows.length; i++) {

            num[i] = arr_rows[i] + arr_rows[i - 1]  ;
        }

        return num;
    }
}
