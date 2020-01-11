import java.util.Arrays;

public class Bagian6_ArrayMultiDimensi {

    static int i, j;

    public static void main(String[] args) {
        //CONTOH 1: CARA MEMBUAT ARRAY 2 DIMENSI DENGAN ASSIGNMENT
        System.out.println("----------------------------------------------------------");
        System.out.println("CONTOH 1: CARA MEMBUAT ARRAY 2 DIMENSI (Dengan Assignment)");
        System.out.println("----------------------------------------------------------");

        /*  Format:
                int[][] array_2D = { {}, {} };

            atau:
                int[][] array_2D = {
                        {},
                        {}
                };
         */

        int[][] array_2D = {
                {1, 2},
                {3, 4}
        };

        printArray2D(array_2D);

        Enter("\n");

        //CONTOH 2: CARA MEMBUAT ARRAY 2 DIMENSI DENGAN DEKLARASI
        System.out.println("---------------------------------------------------------");
        System.out.println("CONTOH 2: CARA MEMBUAT ARRAY 2 DIMENSI (Dengan Deklarasi)");
        System.out.println("---------------------------------------------------------");

        int[][] ArrayAngka = new int[5][2];
        /*
            [5] = Baris
            [2] = Kolom
        */

        System.out.println("Print Data Array Tanpa Referensi Method: ");
        System.out.println(Arrays.deepToString(ArrayAngka));

        Enter("");
        System.out.println("Print Data Array Menggunakan Referensi Method: ");
        printArray2D(ArrayAngka);

        Enter("");
        System.out.println("Print Address Array: ");
        System.out.println(Arrays.toString(ArrayAngka));

        Enter("");
        System.out.println("Panjang Baris: ");
        System.out.println(ArrayAngka.length);

        Enter("");
        System.out.println("Print Data Array Tanpa Referensi Method (Menggunakan Perulangan; For: ");
        for (i = 0; i < ArrayAngka.length; i++) {
            System.out.println(Arrays.toString(ArrayAngka[i]));
        }

        Enter("");
        System.out.println("Print Data Array Menggunakan Referensi Method (Menggunakan Perulangan; For: ");
        for (i = 0; i < ArrayAngka.length; i++) {
            printArray2D(ArrayAngka);
        }

        Enter("\n");

        //CONTOH 3: LOOPING LENGKAP ARRAY 2 DIMENSI SECARA MANUAL
        System.out.println("---------------------------------------------------------");
        System.out.println("CONTOH 3: LOOPING LENGKAP ARRAY 2 DIMENSI  SECARA MANUAL)");
        System.out.println("---------------------------------------------------------");

        for (i = 0; i < ArrayAngka.length; i++) { //Looping Baris
            System.out.print("[");

            for (j = 0; j < ArrayAngka[i].length; j++) { //Looping Kolom
                System.out.print(ArrayAngka[i][j] + ",");
            }

            System.out.print("]\n");
        }

        Enter("\n");

        //CONTOH 4: LOOPING LENGKAP ARRAY 2 DIMENSI SECARA MANUAL MENGGUNAKAN FOR EACH
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("CONTOH 4: LOOPING LENGKAP ARRAY 2 DIMENSI  SECARA MANUAL MENGGUNAKAN FOR EACH)");
        System.out.println("------------------------------------------------------------------------------");

        for (int[] Baris : ArrayAngka) {
            System.out.print("[");
            for (int Angka : Baris) {
                System.out.print(Angka + ",");
            }
            System.out.print("]\n");
        }

        Enter("\n");

        //CONTOH 5: LOOPING LENGKAP ARRAY MULTIDIMENSI YANG MEMILIKI JUMLAH KOLOM YANG SAMA
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("CONTOH 5: LOOPING LENGKAP ARRAY MULTIDIMENSI YANG MEMILIKI JUMLAH KOLOM YANG SAMA");
        System.out.println("----------------------------------------------------------------------------------");

        int[][] array_2D_Ragged = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10, 11},
                {12},
        };

        System.out.print("{\n");

        for (int[] Baris2 : array_2D_Ragged) {
            System.out.print("{");
            for (int Angka2 : Baris2) {
                System.out.print(Angka2 + ",");
            }
            System.out.print("}\n");
        }
        System.out.print("{\n");
    }


    private static void printArray2D(int[][] dataArray) {
        System.out.println(Arrays.deepToString(dataArray));
    }


    private static void Enter(String S) {
        System.out.println(S);
    }
}
