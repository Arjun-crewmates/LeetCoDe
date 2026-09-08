class Solution {
    public int countCommas(int n) {
        if(n==1000){
            return 1;
        }       
        if(n>1000){
            return (n-999);
        }else{
            return 0;
        }
        
        
    }
}