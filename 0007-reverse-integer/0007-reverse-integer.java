class Solution {
    public int reverse(int x) {
        int z = 0;
        while(x!=0){
            int digit = x%10;
            x = x/10;
            if (z > Integer.MAX_VALUE / 10 ||
                (z == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (z < Integer.MIN_VALUE / 10 ||
                (z == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            z = z*10+digit;

        }
        return z;
    }
}