import java.util.Arrays;

public class Bagian4_ArrayLebihDalam {
    public static void main(String[] args) {
        int[] angkaArray1 = {1, 2, 3, 4, 5};
        int[] angkaArray2 = new int[5];

        System.out.println("----------------------------");
        System.out.println("MENGENAL ARRAY LEBIH DALAM");
        System.out.println("----------------------------");

        angkaArray2 = angkaArray1;

        System.out.println("Data Array 1 = " + Arrays.toString(angkaArray1));
        System.out.println("Data Array 2 = " + Arrays.toString(angkaArray2));

        angkaArray1[0] = 100;
        angkaArray1[0] = 400;

        System.out.println("\nData Array 1 = " + Arrays.toString(angkaArray1));
        System.out.println("Data Array 2 = " + Arrays.toString(angkaArray2));

        ubahArray(angkaArray1);
        ubahArray(angkaArray2);

        System.out.println("\nData Array 1 = " + Arrays.toString(angkaArray1));
        System.out.println("Data Array 2 = " + Arrays.toString(angkaArray2));

    }

    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }
}

