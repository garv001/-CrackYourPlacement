class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        int i = 0;
        int j = 1;

        for(j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }
}
