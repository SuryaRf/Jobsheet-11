package Jobsheet_11;

import java.util.Scanner;

public class Tugas2_A_27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukan Jumlah Bintang Yang Diinginkan : ");
        int rows = sc27.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
