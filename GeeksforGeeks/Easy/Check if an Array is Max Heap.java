class Solution {
    public boolean isMaxHeap(int[] arr) {
        for (int i = 0, j = 1, n = arr.length; j < n; i++, j = i * 2 + 1) {
            if (arr[i] < arr[j++]) {
                return false;
            }
            
            if (j >= n) {
                break;
            } else if (arr[i] < arr[j]) {
                return false;
            }
        }
        
        return true;
    }
}