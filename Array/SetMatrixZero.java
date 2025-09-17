public class SetMatrixZero {

    static int[][] MarkCol(int[][] arr, int n, int m, int j) {
        for (int i = 0; i < m; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
                ;
            }
        }
        return arr;
    }

    static int[][] MarkRow(int[][] arr, int n, int m, int i) {
        for (int j = 0; j < m; j++) {

            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
        return arr;

    }

    static int[][] zeroMatrix(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr = MarkRow(arr, n, m, i);
                    arr = MarkCol(arr, n, m, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }

        };

        int n = arr.length;
        int m = arr[0].length;

        int[][] ans = zeroMatrix(arr, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
