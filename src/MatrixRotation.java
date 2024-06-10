public class MatrixRotation {
    // Function to rotate the matrix 90 degrees clockwise
    public static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

    // Function to check if two matrices are equal
    public static boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to check if the matrix can be rotated to match the target
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        System.out.println(findRotation(mat, target));  // Output: true

        int[][] mat2 = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] target2 = {{7,4,1},{8,5,2},{9,6,3}};
        System.out.println(findRotation(mat2, target2));  // Output: false
    }
}
