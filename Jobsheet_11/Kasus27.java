package Jobsheet_11;

import java.util.Scanner;

public class Kasus27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukan jumlah baris yang akan dicetak: ");
        int myrows = sc27.nextInt();
        System.out.println("\nBerikut pola bintang nya... ");
        for (int m = 1; m <= myrows; m++) {
            for (int n = myrows; n > m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = myrows - 1; m >= 1; m--) {
            for (int n = myrows - 1; n >= m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}