// Given a matrix of integers A of size N x M in which each row is sorted.

// Find and return the overall median of matrix A.

// NOTE: No extra memory is allowed.

// NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



import java.io.*;
import java.util.*;

public class GFG {
    class Solution {
        public int findLess(int[][] arr, int row, int target) {
            int index = -1;
            int low = 0;
            int high = arr[row].length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[row][mid] <= target) {
                    index = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            int numElements = index + 1;
            return numElements;
        }

        int median(int[][] matrix, int numRows, int numCols) {
            int left = 1;
            int right = (int)1e9;
            int medianValue = 0;
            int totalElements = numRows * numCols;
            while (left <= right) {
                int mid = (left + right) / 2;
                int numElements = 0;
                for (int row = 0; row < numRows; row++) {
                    numElements += findLess(matrix, row, mid);
                }
                if (numElements > totalElements / 2) {
                    medianValue = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return medianValue;
        }
    }
}
