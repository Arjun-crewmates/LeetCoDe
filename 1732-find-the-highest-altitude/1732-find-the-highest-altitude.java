class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefSum = new int[gain.length+1];
        prefSum[0] = 0;
        int max = 0;
        for(int i = 1;i<=gain.length;i++){
            prefSum[i] = prefSum[i-1] + gain[i-1];
            max = Math.max(max,prefSum[i]);
        }
        return max;
    }
}