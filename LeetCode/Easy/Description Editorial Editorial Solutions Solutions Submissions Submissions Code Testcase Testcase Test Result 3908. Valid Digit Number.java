class Solution {
    public boolean validDigit(int n, int x) {
        return Integer.toString(n).indexOf(Integer.toString(x)) > 0;
    }
}