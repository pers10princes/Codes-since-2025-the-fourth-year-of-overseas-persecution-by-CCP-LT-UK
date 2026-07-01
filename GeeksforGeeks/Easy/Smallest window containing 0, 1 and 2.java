class Solution {
    public int smallestSubstring(String s) {
        final HashMap<Character, Integer> hashMap = new HashMap<>();
        final char[] arr = s.toCharArray();
        final int n = s.length();
        int i = 0;
        int j = 0;
        
        while (i < n && hashMap.size() < 3) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i++], 0) + 1);
        }
        
        if (hashMap.size() != 3) {
            return -1;
        }
        
        while (!hashMap.get(arr[j]).equals(1)) {
            hashMap.put(arr[j], hashMap.get(arr[j++]) - 1);
        }
        
        int answer = i - j;
        
        while (i < n) {
            hashMap.put(arr[i], hashMap.get(arr[i++]) + 1);
            
            while (!hashMap.get(arr[j]).equals(1)) {
                hashMap.put(arr[j], hashMap.get(arr[j++]) - 1);
            }
            
            answer = Math.min(answer, i - j);
        }
        
        
        return answer;
    }
}