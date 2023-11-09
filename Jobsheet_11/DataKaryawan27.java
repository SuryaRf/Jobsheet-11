package Jobsheet_11;

import java.util.Scanner;

public class DataKaryawan27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKaryawan = 3;
        String[] namaKaryawan = new String[jumlahKaryawan];
        int[] gajiKaryawan = new int[jumlahKaryawan];
        int[] umur = new int[jumlahKaryawan];
        String[] domisili = new String[jumlahKaryawan];
        int totalGaji;

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Masukkan nama karyawan ke-" + (i + 1) + ": ");
            namaKaryawan[i] = input.nextLine();
            totalGaji = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan jumlah jam kerja pada hari ke-" + j + ": ");
                int jamKerja = input.nextInt();
                totalGaji += (jamKerja * 50000);

            }
            System.out.print("Masukan umur: ");
            umur[i] = input.nextInt();
            System.out.print("Masukan domisili: ");
            input.nextLine();
            domisili[i] = input.nextLine();
            gajiKaryawan[i] = totalGaji + 1000000;
            input.nextLine();
        }

        System.out.println("Data Karyawan");
        System.out.println("===============");
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Nama Karyawan: " + namaKaryawan[i]);
            System.out.println("Umur: " + umur[i]);
            System.out.println("Domisili: " + domisili[i]);
            System.out.println("Gaji Karyawan: Rp" + gajiKaryawan[i]);
            System.out.println();
        }
    }
}
