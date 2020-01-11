import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Bagian1_PengenalanArray {
    public static void main(String[] args) {
        int[] arrayInteger = {1, 2, 3, 4, 5, 6, 7};

        String[] arrayString = {
                "Rizky Khapidsyah",
                "Dessy Puspita Sari",
                "Lia",
                "Rina",
                "Dina",
                "Falih",
                "Siapa Lagi Ya",
        };

        int X, i;

        Scanner InputUSer = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------");
        System.out.println("CONTOH 1: MENGAKSES DATA ARRAY MELALUI INPUT USER");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Berikut adalah data dari Array = {1, 2, 3, 4, 5, 6, 7}");
        System.out.println();
        System.out.print("Masukkan Index Data Yang Ingin Ditampilkan (0-6): ");
        X = InputUSer.nextInt();

        if (X < 0 || X > 6) {
            System.out.println("\nAngka Yang Diperbolehkan Hanya 0 Sampai 6!");
        } else {
            System.out.println("\nData Yang Anda Plih Adalah : " + arrayInteger[X]);
        }

        System.out.println("\n");

        System.out.println("--------------------------------------------------------------");
        System.out.println("CONTOH 2: MENCETAK DATA ARRAY MENGGUNAKAN PERULANGAN");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Data Array = {");
        for (i = 0; i <= 6; i++) {
            System.out.print(" " + arrayInteger[i] + " ");
        }
        System.out.println("} - Menggunakan Cara Biasa");

        System.out.print("Data Array = ");
        System.out.print(Arrays.toString(arrayInteger));
        System.out.println(" - Mencetak Data Array Menggunakan Library 'Arrays' (java.util.Arrays;)\n\nNama Orang : \n");

        for (i = 0; i <= 6; i++) {
            System.out.println("No. " + arrayInteger[i] + " : " + arrayString[i]);
        }

        System.out.println("\n");

        System.out.println("--------------------------------------------------------------");
        System.out.println("CONTOH 3: DEKLARASI ARRAY");
        System.out.println("--------------------------------------------------------------");

        float[] arrayFloat = new float[7];

        for (i = 0; i <= 6; i++) {
            System.out.println("Cetak Data Array (Float) ke: " + i + " = " + arrayFloat[i]);
        }

        System.out.println("\n");

        arrayFloat[2] = 45;     //Otomatis akan di casting ke integer
        arrayFloat[4] = 1.7f;

        for (i = 0; i <= 6; i++) {
            System.out.println("Cetak Data Array (Float) ke: " + i + " = " + arrayFloat[i]);
        }

    }
}
