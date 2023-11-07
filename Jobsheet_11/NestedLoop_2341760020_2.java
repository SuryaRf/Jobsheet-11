package Jobsheet_11;

import java.util.Scanner;

public class NestedLoop_2341760020_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temps[][] = new int[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            int total = 0; // Inisialisasi total suhu
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
                total += temps[i][j]; // Menambahkan suhu ke total
            }
            double rataRata = (double) total / temps[0].length; // Menghitung rata-rata
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + rataRata);
            System.out.println();
        }

        System.out.println("Rata-rata suhu masing-masing kota:");
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            int total = 0;
            for (int j = 0; j < temps[0].length; j++) {
                total += temps[i][j];
            }
            double rataRata = (double) total / temps[0].length;
            System.out.println(rataRata);
        }
    }
}
