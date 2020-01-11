
import java.util.Arrays;
import java.util.Scanner;

public class Bagian2_OperasiPadaArray {
    static int[] arrayAngka1 = {1, 2, 3, 4, 5, 6, 7};
    static int[] arrayAngka2 = new int[7];
    static int[] arrayAngka3 = new int[7];
    static int[] arrayAngka4 = new int[7];
    static int[] arrayAngka5 = new int[7];
    static int[] arrayAngka6 = {5, 3, 6, 2, 8, 7, 6};
    static int[] arrayAngka7 = {1, 6, 3, 4, 1, 4, 9};
    static int[] arrayAngka8 = {4, 2, 9, 3, 1, 9, 6, 4, 5, 7};

    static int InputUserData;
    static Scanner InputUserScan;

    public static void main(String[] args) {

        CetakArray(arrayAngka1);
        CopyArray_MenggunakanLoop(arrayAngka1, arrayAngka2);
        CopyArray_MenggunakanCopyOf(arrayAngka1, arrayAngka3);
        CopyArray_MenggunakanCopyOfRange(arrayAngka1, arrayAngka4);
        IsiElementArrayMenggunakan_FillArray(arrayAngka5);
        BandingkanArray(arrayAngka6, arrayAngka7);
        UrutkanDataArray(arrayAngka6, arrayAngka7);
        SearchDataArray(arrayAngka6, arrayAngka7, arrayAngka8);
        CetakHashCodeArray(arrayAngka1, arrayAngka6, arrayAngka7, arrayAngka8);

    }

    //Merubah Array Menjadi String dan Mencetaknya Ke Layar
    private static void CetakArray(int[] DataArray) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("MERUBAH DAN MENCETAK ARRAY MENDARI STRING MENGGUNAKAN LIBRARY 'Arrays' (java.util.Arrays)");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Data Array = " + Arrays.toString(DataArray)); //Fokus Ke Sini

        System.out.println();
    }

    //Mengcopy Isi Elemen Array ke Lokasi/Data Array Yang Lain (Menggunakan Looping/Perulangan)
    private static void CopyArray_MenggunakanLoop(int[] DataArray1, int[] DataArray2) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("MENGCOPY ISI ELEMEN ARRAY KE LOKASI/DATA ARRAY YANG LAIN (Menggunakan Loop)");
        System.out.println("-----------------------------------------------------------------------------");

        //Fokus mulai dari sini  :
        System.out.println("Isi Data Awal : ");
        System.out.println("Data Array1 = " + Arrays.toString(DataArray1));
        System.out.println("Data Array1 = " + Arrays.toString(DataArray2));

        //Copy Elemen Menggunakan Loop
        for (int i = 0; i <= 6; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        System.out.println();

        System.out.println("Isi Data Akhir : ");
        System.out.println("Data Array1 = " + Arrays.toString(DataArray1));
        System.out.println("Data Array1 = " + Arrays.toString(DataArray2));

        System.out.println();

        System.out.println("Address Array : ");
        System.out.println("Data Array1 = " + DataArray1);
        System.out.println("Data Array1 = " + DataArray2);

        System.out.println();
    }

    //Mengcopy Isi Elemen Array ke Lokasi/Data Array Yang Lain (Menggunakan perintah CopyOf)
    private static void CopyArray_MenggunakanCopyOf(int[] DataArray1, int[] DataArray3) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("MENGCOPY ISI ELEMEN ARRAY KE LOKASI/DATA ARRAY YANG LAIN (Menggunakan CopyOf)");
        System.out.println("-----------------------------------------------------------------------------");

        //Fokus mulai dari sini  :
        System.out.println("Isi Data Awal : ");
        System.out.println("Data Array1 = " + Arrays.toString(DataArray1));
        System.out.println("Data Array3 = " + Arrays.toString(DataArray3));

        //Copy Elemen Menggunakan CopyOf
        //Mengcopy Elemen dari dataArray1 ke dataArray3, namun hanya sepanjang 4 elemen saja
        DataArray3 = Arrays.copyOf(DataArray1, 4);
        System.out.println();

        System.out.println("Isi Data Akhir : ");
        System.out.println("Data Array1 = " + Arrays.toString(DataArray1));
        System.out.println("Data Array3 = " + Arrays.toString(DataArray3));

        System.out.println();

        System.out.println("Address Array : ");
        System.out.println("Data Array1 = " + DataArray1);
        System.out.println("Data Array1 = " + DataArray3);

        System.out.println();
    }

    //Mengcopy Isi Elemen Array ke Lokasi/Data Array Yang Lain Namun hanya beberapa elemen tertentu saja
    private static void CopyArray_MenggunakanCopyOfRange(int[] DataArray1, int[] DataArray4) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("MENGCOPY ISI ELEMEN ARRAY KE LOKASI/DATA ARRAY YANG LAIN (Dimulai Dari Elemen Tertentu)");
        System.out.println("---------------------------------------------------------------------------------------");

        //Fokus mulai dari sini  :
        System.out.println("Isi Data Awal : ");
        System.out.println("Data Array1 = " + Arrays.toString(DataArray1));
        System.out.println("Data Array4 = " + Arrays.toString(DataArray4));

        //Copy Elemen Menggunakan CopyOfRange
        //Mengcopy Elemen dari dataArray1 ke dataArray4, namun hanya dimulai dari elemen tertentu saja
        DataArray4 = Arrays.copyOfRange(DataArray1, 2, 4); //Data dari index ke 2 sampai 4 dicopy ke dataArray4
        System.out.println();

        System.out.println("Isi Data Akhir : ");
        System.out.println("Data Array1 = " + Arrays.toString(DataArray1));
        System.out.println("Data Array4 = " + Arrays.toString(DataArray4));

        System.out.println();

        System.out.println("Address Array : ");
        System.out.println("Data Array1 = " + DataArray1);
        System.out.println("Data Array4 = " + DataArray4);

        System.out.println();
    }

    //Mengisi Elemet Array Menggunakan Fill Array
    private static void IsiElementArrayMenggunakan_FillArray(int[] DataArray5) {
        InputUserScan = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------------");
        System.out.println("MENGISI ELEMEN ARRAY MENGGUNAKAN FILL ARRAY (Menggunakan Fill Array)");
        System.out.println("---------------------------------------------------------------------");

        //Fokus mulai dari sini  :
        System.out.println("Isi Data Awal : ");
        System.out.println("Data Array5 = " + Arrays.toString(DataArray5) + "\n");

        System.out.print("Masukkan Angka Yang Ingin Dimasukkan ke Elemen Array (Cth: 7)  : ");
        InputUserData = InputUserScan.nextInt();

        //Mengisi element dengan data yang sama berdasarkan input user
        Arrays.fill(DataArray5, InputUserData); //'InputUSerData' bisa juga diganti dengan Angka langsung (int)
        System.out.println();

        System.out.println("Isi Data Akhir : ");
        System.out.println("Data Array5 = " + Arrays.toString(DataArray5) + "\n");
    }

    //Compare/Membandingkan 2 buah data Array
    private static void BandingkanArray(int[] DataArray6, int[] DataArray7) {
        System.out.println("--------------------------------------------");
        System.out.println("KOMPARASI / MEMBANDINGKAN 2 BUAH DATA ARRAY");
        System.out.println("--------------------------------------------");
        System.out.println("Data Array6 = " + Arrays.toString(DataArray6));
        System.out.println("Data Array7 = " + Arrays.toString(DataArray7));

        System.out.println();

        if (Arrays.equals(DataArray6, DataArray7)) {
            System.out.println("Status: Kedua Array Diatas = Sama.");
        } else {
            System.out.println("Status: Kedua Array Diatas = Tidak Sama");
        }

        System.out.println();
    }

    //Mencoba Mengurutkan Data Array
    private static void UrutkanDataArray(int[] DataArray6, int[] DataArray7) {
        System.out.println("----------------------------------------------------");
        System.out.println("MENGURUTKAN ELEMENT DATA ARRAY (MENGGUNAKAN 'SORT')");
        System.out.println("----------------------------------------------------");
        System.out.println("Data Awal :");
        System.out.println("Data Array6 = " + Arrays.toString(DataArray6));
        System.out.println("Data Array7 = " + Arrays.toString(DataArray7));

        Arrays.sort(DataArray6, 0, 7);  //Mengurutkan Data Array
        Arrays.sort(DataArray7, 0, 7);  //Mengurutkan Data Array

        System.out.println("\nSetelah Diurutkan Menjadi :");
        System.out.println("Data Array6 = " + Arrays.toString(DataArray6));
        System.out.println("Data Array7 = " + Arrays.toString(DataArray7));

        System.out.println();
    }

    //Mencoba Search pada data Array
    private static void SearchDataArray(int[] DataArray6, int[] DataArray7, int[] DataArray8) {
        int Posisi_1, Posisi_2, Posisi_3;

        System.out.println("------------------");
        System.out.println("SEARCH DATA ARRAY");
        System.out.println("------------------");
        System.out.println("Data Array Yang Tersedia :");
        System.out.println("Data Array6 = " + Arrays.toString(arrayAngka6));
        System.out.println("Data Array7 = " + Arrays.toString(arrayAngka7));
        System.out.println("Data Array8 = " + Arrays.toString(arrayAngka8));
        System.out.println();

        System.out.print("Masukkan Angka Yang Ingin Dicari Dari Ketiga Array Diatas : ");
        InputUserData = InputUserScan.nextInt();

        Arrays.sort(DataArray6);
        Arrays.sort(DataArray8);
        Arrays.sort(DataArray7);

        Posisi_1 = Arrays.binarySearch(DataArray6, InputUserData);
        Posisi_2 = Arrays.binarySearch(DataArray7, InputUserData);
        Posisi_3 = Arrays.binarySearch(DataArray8, InputUserData);

        System.out.println("\nAngka: " + InputUserData);

        if (Posisi_1 < 0) {
            System.out.println("=> Tidak ada di Data Array6");
        } else {
            System.out.println("=> Berada di index: " + Posisi_1 + ", pada Data Array6");
        }

        if (Posisi_2 < 0) {
            System.out.println("=> Tidak ada di Data Array7");
        } else {
            System.out.println("=> Berada di index: " + Posisi_2 + ", pada Data Array7");
        }

        if (Posisi_3 < 0) {
            System.out.println("=> Tidak ada di Data Array8");
        } else {
            System.out.println("=> Berada di index: " + Posisi_3 + ", pada Data Array8");
        }
    }

    //Cetak Hash Kode Array
    private static void CetakHashCodeArray(int[] DataArray1, int[] DataArray6, int[] DataArray7, int[] DataArray8) {
        System.out.println("\n--------------------------");
        System.out.println("CETAK HASHCODE DATA ARRAY");
        System.out.println("--------------------------");
        System.out.println("Cara 1:");
        System.out.println(Arrays.toString(new int[]{Arrays.hashCode(DataArray1)}));
        System.out.println(Arrays.toString(new int[]{Arrays.hashCode(DataArray6)}));
        System.out.println(Arrays.toString(new int[]{Arrays.hashCode(DataArray7)}));
        System.out.println(Arrays.toString(new int[]{Arrays.hashCode(DataArray8)}));
        System.out.println("\nCara 2:");
        System.out.println(Arrays.hashCode(DataArray1));
        System.out.println(Arrays.hashCode(DataArray6));
        System.out.println(Arrays.hashCode(DataArray7));
        System.out.println(Arrays.hashCode(DataArray8));
    }
}
