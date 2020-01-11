import java.util.Arrays;

public class Bagian7_ArrayMultiDimensiLanjut {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("MENGENAL ARRAY MULTIDIMENSI LEBIH DALAM (TIPE int)");
        System.out.println("--------------------------------------------------");

        int[][] array_2D = {
                {1, 2, 3},
                {4, 5},
        };

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);

        System.out.println(Arrays.deepToString(array_2D));
        System.out.println("\n");

        System.out.println("---------------------------------------------------");
        System.out.println("MENGENAL ARRAY MULTIDIMENSI LEBIH DALAM (TIPE char)");
        System.out.println("---------------------------------------------------");

        char[] array_char1 = {'a', 'b', 'c'};
        char[] array_char2 = {'d', 'e'};

        char[][] arrayChar_2D = {
                array_char1,
                array_char2,
        };

        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));
    }
}
