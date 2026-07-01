class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        final ArrayList<Integer> answer = new ArrayList<>();
        
        for (final int num : arr) {
            if (answer.isEmpty() || Integer.signum(answer.getLast()) == Integer.signum(num)) {
                answer.add(num);
            } else {
                final int y = Math.abs(num);
                boolean t = true;
                
                while (t && !answer.isEmpty()) {
                    final int d = Math.abs(answer.getLast()) - y;
                    
                    if (d == 0) {
                        answer.removeLast();
                        t = false;
                    } else if (d < 0) {
                        answer.removeLast();
                    } else {
                        t = false;
                    }
                }
                
                if (t) {
                    answer.add(num);
                }
            }
        }
        
        return answer;
    }
}