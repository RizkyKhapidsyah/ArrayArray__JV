

public class Bagian3_LoopingArrayDenganForEach {
    public static void main(String[] args) {
        int[] angkaArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i;

        //Cetak Angka Array Menggunakan Looping Standard
        System.out.println("----------------------------------------------");
        System.out.println("CETAK DATA ARRAY MENGGUNAKAN LOOPING STANDARD");
        System.out.println("----------------------------------------------");

        for (i = 0; i < 10; i++) {
            System.out.println("Index ke: " + i + " adalah angka = " + angkaArray[i]);
        }

        //Looping Menggunakan Properti Dari Arraynya
        System.out.println("\n-------------------------------------------------");
        System.out.println("CETAK DATA ARRAY MENGGUNAKAN PROPERTI DARI ARRAY");
        System.out.println("-------------------------------------------------");

        for (i = 0; i < angkaArray.length; i++) {
            System.out.println("Index ke: " + i + " adalah angka = " + angkaArray[i]);
        }

        //Looping Khusus Untuk Collection <- Array
        System.out.println("\n----------------------------------------------");
        System.out.println("CETAK DATA ARRAY MENGGUNAKAN LOOPING FOR EACH");
        System.out.println("----------------------------------------------");

        for (int Angka : angkaArray) {
            System.out.println("Angka Pada Looping ini = " + Angka);
        }


    }
}
