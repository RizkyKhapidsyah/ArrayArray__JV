import java.util.Arrays;

public class Bagian5_LatihanArray {
    static int i, j;

    static int[] DataArray1 = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2};
    static int[] DataArray2 = {2, 4, 6, 8, 0, 9, 7, 5, 3, 1};
    static int[] DataArray3 = {4, 3, 5, 6, 3, 8, 7, 1, 9, 2};
    static int[] DataArray4 = {12, 33, 24, 15, 21, 55, 32, 82, 10, 193};
    static int[] DataArrayHasil1 = new int[DataArray1.length];
    static int[] DataArrayHasil2 = new int[DataArray1.length + DataArray2.length];

    public static void main(String[] args) {

        /*  Tugas dari bang Pukis :
            - Urutkan elemen data array dari yang terbesar ke terkecil
            - Melakukan operasi aritmatika pada masing - masing elemen array
         */

        //CONTOH 1: MELAKUKAN OPERASI ARITMATIKA ANTAR ELEMENT PADA DATA ARRAY
        System.out.println("---------------------------------------------------------------------");
        System.out.println("CONTOH 1: MELAKUKAN OPERASI ARITMATIKA ANTAR ELEMENT PADA DATA ARRAY");
        System.out.println("---------------------------------------------------------------------");

        for (i = 0; i < DataArray1.length; i++) {
            DataArrayHasil1[i] = DataArray1[i] + DataArray2[i];
        }

        CetakData("Array 1 = ", DataArray1);
        CetakData("Array 2 = ", DataArray2);
        PrintGarisBawah("_", 50, "+");
        CetakHasil(DataArrayHasil1, "Hasil   = ");
        Enter("");

        for (i = 0; i < DataArray1.length; i++) {
            DataArrayHasil1[i] = DataArray1[i] * DataArray2[i];
        }

        CetakData("Array 1 = ", DataArray1);
        CetakData("Array 2 = ", DataArray2);
        PrintGarisBawah("_", 50, "x");
        CetakHasil(DataArrayHasil1, "Hasil   = ");
        Enter("");

        for (i = 0; i < DataArray1.length; i++) {
            try {
                DataArrayHasil1[i] = DataArray1[i] / DataArray2[i];

            } catch (Exception e) {
                continue;
            }
        }

        CetakData("Array 1 = ", DataArray1);
        CetakData("Array 2 = ", DataArray2);
        PrintGarisBawah("_", 50, "/");
        CetakHasil(DataArrayHasil1, "Hasil   = ");
        Enter("");

        for (i = 0; i < DataArray1.length; i++) {
            DataArrayHasil1[i] = DataArray1[i] - DataArray2[i];
        }

        CetakData("Array 1 = ", DataArray1);
        CetakData("Array 2 = ", DataArray2);
        PrintGarisBawah("_", 50, "-");
        CetakHasil(DataArrayHasil1, "Hasil   = ");
        Enter("\n");

        //CONTOH 2: MENGGABUNGKAN ELEMENT/DATA ARRAY
        System.out.println("------------------------------------------------------");
        System.out.println("CONTOH 2: MENGGABUNGKAN ANTAR ELEMENT PADA DATA ARRAY");
        System.out.println("------------------------------------------------------");

        CetakData("Array 1 = ", DataArray1);
        CetakData("Array 2 = ", DataArray2);

        for (i = 0; i < DataArray1.length; i++) {
            DataArrayHasil2[i] = DataArray1[i];
        }

        for (i = 0; i < DataArray1.length; i++) {
            DataArrayHasil2[i + DataArray1.length] = DataArray2[i];
        }

        Enter("\nHasil Setelah Digabungkan : ");
        CetakHasil(DataArrayHasil2, "");

        Enter("");

        //CONTOH 3: ME-REVERSE/MENGURUTKAN ELEMEN DARI NILAI TERBESAR DAN TERKECIL (CARA 1)
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("CONTOH 3: ME-REVERSE/MENGURUTKAN ELEMEN DARI NILAI TERBESAR KE TERKECIL (CARA 1)");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Data Awal:");
        CetakData("Array 1 = ", DataArray1);
        CetakData("Array 2 = ", DataArray2);

        //Algoritma Pengurutan Reverse Dimulai Dari Sini

        Arrays.sort(DataArray1);
        Arrays.sort(DataArray2);

        int[] ArrayBuffer1 = Arrays.copyOf(DataArray1, DataArray1.length);
        int[] ArrayBuffer2 = Arrays.copyOf(DataArray2, DataArray2.length);

        for (i = 0; i < 10; i++) {
            DataArray1[i] = ArrayBuffer1[(ArrayBuffer1.length - 1) - i];
            DataArray2[i] = ArrayBuffer2[(ArrayBuffer2.length - 1) - i];
        }

        Enter("\nSetelah diurutkan: ");

        CetakHasil(DataArray1, "Array 1  = ");
        CetakHasil(DataArray2, "Array 2  = ");

        Enter("");

        //CONTOH 4: ME-REVERSE/MENGURUTKAN ELEMEN DARI NILAI TERBESAR DAN TERKECIL (CARA 2)
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("CONTOH 4: ME-REVERSE/MENGURUTKAN ELEMEN DARI NILAI TERBESAR KE TERKECIL (CARA 2)");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Data Awal:");
        CetakData("Array 3 = ", DataArray3);
        CetakData("Array 4 = ", DataArray4);

        //Algoritma Pengurutan Reverse Dimulai Dari Sini

        Arrays.sort(DataArray3);
        Arrays.sort(DataArray4);

        int Bufffer3, Bufffer4;

        for (i = 0; i < 10; i++) {
            Bufffer3 = DataArray3[i];
            DataArray3[i] = DataArray3[(DataArray3.length - 1) - i];
            DataArray3[(DataArray3.length - 1) - i] = Bufffer3;

            Bufffer4 = DataArray4[i];
            DataArray4[i] = DataArray4[(DataArray4.length - 1) - i];
            DataArray4[(DataArray4.length - 1) - i] = Bufffer4;
        }

        Enter("\nSetelah diurutkan: ");

        CetakHasil(DataArray3, "Array 3  = ");
        CetakHasil(DataArray4, "Array 4  = ");
    }

    private static void CetakHasil(int[] DataArrayParam, String Kalimat) {
        System.out.println(Kalimat + Arrays.toString(DataArrayParam));
    }

    private static void CetakData(String sData, int[] DataArrayParam) {
        System.out.println(sData + Arrays.toString(DataArrayParam));
    }

    private static void Enter(String Kar) {
        System.out.println(Kar);
    }

    private static void PrintGarisBawah(String Karakter, int Jumlah, String Operator) {
        for (j = 1; j <= Jumlah; j++) {
            System.out.print(Karakter);
        }
        System.out.print(" " + Operator + "\n");
    }

}
