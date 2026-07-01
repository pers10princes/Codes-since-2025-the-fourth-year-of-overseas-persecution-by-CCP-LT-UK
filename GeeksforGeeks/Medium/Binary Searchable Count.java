class Solution {
    public int binarySearchable(int[] arr) {
        int ans = 0;
        
        for (int num : arr) {
            if (bs(arr, num)) {
                ans++;
            }
        }
        
        return ans;
    }
    
    
    boolean bs(int[] arr, int target) {
        for (int n = arr.length, l = 0, r = n - 1, mid = (l + r) / 2; l <= r; mid = (l + r) / 2) {
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        return false;
    }
}