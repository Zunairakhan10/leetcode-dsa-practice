class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int num:nums){
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> missing = new ArrayList<>();
        for(int num=min;num<=max;num++){
            if(!set.contains(num)){
                missing.add(num);
            }
        }
        return missing;
    }
}