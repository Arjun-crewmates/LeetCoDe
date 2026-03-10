class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];

        int product = 1;
        int count = 0;

        for(int num : nums){
            if(num == 0){
                count++;
            }
            else{
                product *= num;
            }
        }
        if(count>1){
            return result;        
        }

        for(int i=0; i<n; i++){
            if(count==0){
                result[i]= product / nums[i];
            }
            else{
                if(nums[i]==0){
                    result[i] = product;
                }
                else{
                    result[i]=0;
                }
            }
        }
        return result;
    }
}