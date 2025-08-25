import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        // 1D Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // MultiD Arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(matrix));
    }
}
