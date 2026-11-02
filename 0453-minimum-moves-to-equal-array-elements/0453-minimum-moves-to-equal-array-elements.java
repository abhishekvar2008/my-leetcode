class Solution {
    public int minMoves(int[] nums) {
        int n= nums.length;
        int count=0;
        int min= nums[0];
        for(int i=0;i<n;i++){
            count+=nums[i];
            if(min>nums[i]){
                min= nums[i];
            }
        }
        return count-n*min;
    }
}