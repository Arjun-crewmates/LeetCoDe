class Solution {
    public boolean isPowerOfFour(int n) {
        long x = 1;

while (x <= n) {

    if (x == n) {
        return true;
    }

    x = x*4;
}

return false;
    }
}