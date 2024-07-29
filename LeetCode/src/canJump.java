class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int count=0;
        int cover=0;
        for(int i=0;i<=cover;i++){
            count=i+nums[i];
            cover=Math.max(cover,count);
            if(cover>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}