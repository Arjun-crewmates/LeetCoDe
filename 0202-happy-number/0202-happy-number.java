class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        if(n==1){
            return true;
        }
        while (n != 1) {
            if (s.contains(n)) {
                return false;
            } else {
                s.add(n);
            }
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit * digit;
                temp = temp / 10;
            }
            n = sum;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}