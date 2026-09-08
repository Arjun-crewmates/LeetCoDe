class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums1){
            if(map1.containsKey(num)){
                map1.put(num,map1.get(num) + 1);
            }else{
                map1.put(num,1);
            }
        }
        for(int nums : nums2){
            if(map2.containsKey(nums)){
                map2.put(nums,map2.get(nums) + 1);
            }else{
                map2.put(nums,1);
            }
        }
        for(int n : map1.keySet()){
            if(map2.containsKey(n)){
                int count1 = map1.get(n);
                int count2 = map2.get(n);
                int count = Math.min(count1,count2);
                for(int i =0;i<count;i++){
                    arr.add(n);
                }
            }
        }  
        int[] res = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}