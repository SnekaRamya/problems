class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int neg = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int val = Math.abs(matrix[i][j]);

                if (matrix[i][j] < 0) {
                    neg++;
                }

                min = Math.min(min, val);
                sum += val;
            }
        }

        // If number of negatives is even
        if (neg % 2 == 0) {
            return sum;
        }

        // If odd negatives, subtract twice the minimum absolute value
        return sum - 2L * min;
    }
}