import java.util.*;

public class sprial_matrix {

    public static void spiral(int arr[][]) {
        int n = arr.length, m = arr[0].length;
        int StarRow = 0, EndRow = n - 1, StartCol = 0, EndCol = m - 1;
        while (StarRow <= EndRow && StartCol <= EndCol) {
            // top
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(arr[StarRow][j] + " ");
            }
            // right
            for (int i = StarRow + 1; i <= EndRow; i++) {
                System.out.print(arr[i][EndCol] + " ");
            }
            // bottom
            for (int j = EndCol - 1; j >= StartCol; j--) {
                System.out.print(arr[EndRow][j] + " ");
            }
            // left
            for (int i = EndRow - 1; i >= StarRow; i--) {
                System.out.print(arr[i][StartCol] + " ");
            }

            StarRow++;
            EndRow--;
            StartCol++;
            EndCol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }, };

        spiral(arr);
    }
}
