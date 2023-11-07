package Jobsheet_11;

import java.util.Scanner;

public class TugasIndividu2_27 {
     public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int n = sc22.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
