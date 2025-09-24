public class RotateMatrixByOptimalInNinetyDegree {
    public static int[][] RotateByNintyDegree(int[][] matrix, int n) {
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j]; // store original value
                matrix[i][j] = matrix[j][i]; // assign transposed value
                matrix[j][i] = temp; // place original value in new position
            }
        }
        // step 2 reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j]; // store left element
                matrix[i][j] = matrix[i][n - 1 - j]; // assign right element to left
                matrix[i][n - 1 - j] = temp; // place left element to right
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int n = arr.length;
        int[][] ans = RotateByNintyDegree(arr, n);
        System.out.println("image of rotated matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
