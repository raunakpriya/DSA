class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(matrix[mid][matrix[0].length - 1] < target) {
                start = mid + 1;
            } else if(matrix[mid][0] > target) {
                end = mid - 1;
            } else  {
                break;
            }
        }
        if(!(start <= end)) {
            return false;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int row = start + (end - start)/2;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(target > matrix[row][mid]) {
                left = mid + 1;
            } else if (target < matrix[row][mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
