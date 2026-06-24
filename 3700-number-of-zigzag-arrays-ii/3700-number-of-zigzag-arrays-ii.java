class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        if (n == 1) return m;

        int size = 2 * m;
        long[][] T = new long[size][size];

        // Build the transition matrix
        // First m rows correspond to D[y] (next move is down)
        // Last m rows correspond to U[y] (next move is up)
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < m; x++) {
                if (x < y) {
                    T[y][m + x] = 1; // D[y] receives from U[x] where x < y
                }
                if (x > y) {
                    T[m + y][x] = 1; // U[y] receives from D[x] where x > y
                }
            }
        }

        // Raise transition matrix to the power of (n - 1)
        long[][] Tn = matrixPower(T, n - 1);

        // Initial vector has 1s for all starting configurations
        long[] initVector = new long[size];
        for (int i = 0; i < size; i++) {
            initVector[i] = 1;
        }

        // Multiply T^(n-1) by the initial vector and sum the total combinations
        long totalWays = 0;
        for (int i = 0; i < size; i++) {
            long rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum = (rowSum + Tn[i][j] * initVector[j]) % MOD;
            }
            totalWays = (totalWays + rowSum) % MOD;
        }

        return (int) totalWays;
    }

    // Helper method for Matrix Exponentiation
    private long[][] matrixPower(long[][] base, long exp) {
        int size = base.length;
        long[][] result = new long[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = multiplyMatrices(result, base);
            }
            base = multiplyMatrices(base, base);
            exp >>= 1;
        }
        return result;
    }

    // Helper method to multiply two square matrices
    private long[][] multiplyMatrices(long[][] A, long[][] B) {
        int size = A.length;
        long[][] C = new long[size][size];
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (A[i][k] == 0) continue;
                for (int j = 0; j < size; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }
}