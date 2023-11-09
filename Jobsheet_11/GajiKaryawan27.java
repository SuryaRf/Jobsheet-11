package Jobsheet_11;

import java.util.Scanner;

public class GajiKaryawan27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int jumlahKaryawan = 3;
        int jumlahHariKerja = 5;
        int gajiPokok = 1000000;
        int bonus = 50000;
        int totalGaji;

        for (int i = 1; i <= jumlahKaryawan; i++) {
            System.out.println("Karyawan " + i);
            System.out.println("===============");
            totalGaji = 0;
            for (int j = 1; j <= jumlahHariKerja; j++) {
                System.out.print("Masukkan jumlah jam kerja pada hari ke-" + j + ": ");
                int jamKerja = input27.nextInt();
                totalGaji += (jamKerja * 50000);
            }
            totalGaji += gajiPokok;
            totalGaji += bonus;
            System.out.println("Total gaji karyawan " + i + " adalah Rp" + totalGaji);
            System.out.println();
        }
    }
}
