class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(n);
        
        if (n < k) {
            for (int i = 0; i < k; i++) {
                ans.add(-1);
            }
            
            return ans;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k + 1);
        
        for (int i = 0, o = k - 1; i < o; i++) {
            ans.add(-1);
            pq.offer(arr[i]);
        }
        
        pq.offer(arr[k - 1]);
        ans.add(pq.peek());
        
        for (int i = k; i < n; i++) {
            pq.offer(arr[i]);
            pq.poll();
            ans.add(pq.peek());
        }
        
        return ans;
    }
}