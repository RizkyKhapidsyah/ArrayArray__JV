public class Bagian8_OperasiMatrixMenggunakanArray {
    final static String[] Judul = {
            "CONTOH 1 - DATA MATRIX 1",
            "CONTOH 2 - DATA MATRIX 2",
            "CONTOH 3 - OPERASI ARITMATIKA PADA MATRIX"
    };

    static int[][] ContohMatrix_1 = {
            {47, 22, 31},
            {72, 11, 54},
            {63, 85, 94},
    };

    static int[][] ContohMatrix_2 = {
            {30, 11, 23},
            {18, 99, 54},
            {27, 12, 43},

    };

    static int[][] ContohMatrix_3 = {
            {30, 11, 23},
            {18, 99, 54},
    };

    public static void main(String[] args) {

        CetakBanner("-", Judul[0], "-");
        cetakMatrix(ContohMatrix_1);

        CetakBanner("-", Judul[1], "-");
        cetakMatrix(ContohMatrix_2);

        CetakBanner("-", Judul[2], "-");
        System.out.println("Data Matrix 1: ");
        cetakMatrix(ContohMatrix_1);
        System.out.println("\nData Matrix 2: ");
        cetakMatrix(ContohMatrix_2);

        System.out.println("\nHasil (Penambahan) Matrix 1 dan Matrix 2 : ");
        OperasiMatrix_Penambahan(ContohMatrix_1, ContohMatrix_2);

        System.out.println("\nHasil (Pengurangan) Matrix 1 dan Matrix 2 : ");
        OperasiMatrix_Pengurangan(ContohMatrix_1, ContohMatrix_2);

        System.out.println("\nHasil (Perkalian) Matrix 1 dan Matrix 2 : ");
        OperasiMatrix_Perkalian(ContohMatrix_1, ContohMatrix_2);

        System.out.println("\nHasil (Pembagian) Matrix 1 dan Matrix 2 : ");
        OperasiMatrix_Pembagian(ContohMatrix_1, ContohMatrix_2);

        System.out.println("\nHasil (Penambahan) Matrix 2 dan Matrix 3 (Namun Jumlah Baris Kolom Tidak Sama : ");
        OperasiMatrix_Penambahan2(ContohMatrix_2, ContohMatrix_3);

        /*
        Berikut Kode Untuk Operasi Aritmatika pada Matrix, jika Tanpa Method

        int baris_a = ContohMatrix_1.length;
        int kolom_a = ContohMatrix_1[0].length;
        int[][] hasil = new int[baris_a][kolom_a];

        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_a; j++) {
                hasil[i][j] = ContohMatrix_1[i][j] + ContohMatrix_2[i][j];
            }
        }

        cetakMatrix(hasil);
        */
    }

    private static void cetakMatrix(int[][] data) {
        int Baris = data.length;
        int Kolom = data[0].length;

        for (int i = 0; i < Baris; i++) {
            System.out.print("{");

            for (int j = 0; j < Kolom; j++) {
                System.out.print(data[i][j]);
                if (j < (Kolom - 1)) {
                    System.out.print(", ");
                } else {
                    System.out.print("}");
                }
            }
            System.out.println();
        }
    }

    private static void OperasiMatrix_Penambahan(int[][] cm1_param, int[][] cm2_param) {
        int[][] Hasil = new int[cm1_param.length][cm1_param[0].length];

        for (int i = 0; i < cm1_param.length; i++) {
            for (int j = 0; j < cm2_param[0].length; j++) {
                Hasil[i][j] = cm1_param[i][j] + cm2_param[i][j];
            }
        }

        cetakMatrix(Hasil);
    }

    private static void OperasiMatrix_Perkalian(int[][] cm1_param, int[][] cm2_param) {
        int Bufffer;
        int[][] Hasil = new int[cm1_param.length][cm2_param[0].length];

        for (int i = 0; i < cm1_param.length; i++) {
            for (int j = 0; j < cm2_param[0].length; j++) {
                Bufffer = 0;

                for (int k = 0; k < cm1_param[0].length; k++) {
                    Bufffer += cm1_param[i][k] * cm2_param[k][j];
                }

                Hasil[i][j] = Bufffer;
            }
        }

        cetakMatrix(Hasil);
    }

    private static void OperasiMatrix_Pengurangan(int[][] cm1_param, int[][] cm2_param) {
        int[][] Hasil = new int[cm1_param.length][cm1_param[0].length];

        for (int i = 0; i < cm1_param.length; i++) {
            for (int j = 0; j < cm2_param[0].length; j++) {
                Hasil[i][j] = cm1_param[i][j] - cm2_param[i][j];
            }
        }

        cetakMatrix(Hasil);
    }

    private static void OperasiMatrix_Pembagian(int[][] cm1_param, int[][] cm2_param) {
        int[][] Hasil = new int[cm1_param.length][cm1_param[0].length];

        for (int i = 0; i < cm1_param.length; i++) {
            for (int j = 0; j < cm2_param[0].length; j++) {
                Hasil[i][j] = cm1_param[i][j] / cm2_param[i][j];
            }
        }

        cetakMatrix(Hasil);
    }

    private static void OperasiMatrix_Penambahan2(int[][] cm2_param, int[][] cm3_param) {
        int[][] Hasil = new int[cm2_param.length][cm2_param[0].length];

        if ((cm2_param.length == cm3_param.length) && (cm2_param[0].length == cm3_param[0].length)) {
            for (int i = 0; i < cm2_param.length; i++) {
                for (int j = 0; j < cm3_param[0].length; j++) {
                    Hasil[i][j] = cm2_param[i][j] + cm3_param[i][j];
                }
            }
            cetakMatrix(Hasil);
        } else {
            System.out.println("\n=> Jumlah Baris/Kolom Matrix 2 dan 3 Tidak Sama!");
            if ((cm2_param.length < cm3_param.length) && (cm2_param[0].length < cm3_param[0].length)) {
                System.out.println("=> Jumlah Baris Pada Matrix 3 Lebih Banyak Daripada Jumlah Baris Pada Matrix 2");
                System.out.println("=> Jumlah Kolom Pada Matrix 3 Lebih Banyak Daripada Jumlah Kolom Pada Matrix 2");
            } else {
                System.out.println("=> Jumlah Baris Pada Matrix 2 Lebih Banyak Daripada Jumlah Baris Pada Matrix 3");
                System.out.println("=> Jumlah Kolom Pada Matrix 2 Lebih Banyak Daripada Jumlah Kolom Pada Matrix 3");
            }
        }
    }


    //Abaikan Fungsi Ini (Hanya Fungsi Tambahan Untuk Mencetak Judul)
    private static void CetakBanner(String C1param, String Jparam, String C2param) {
        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print(C1param);
        }

        System.out.println("\n" + Jparam);

        for (int i = 0; i < 50; i++) {
            System.out.print(C2param);
        }

        System.out.println();
    }

}