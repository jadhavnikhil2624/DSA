class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast=0;
        while(1==1){
            slow = nums[slow];
            fast=nums[nums[fast]];
            if (slow==fast)
                break;
        }
        int beginCycle=0;
        while(1==1){
            slow=nums[slow];
            beginCycle=nums[beginCycle];
            if (beginCycle==slow)
                return beginCycle;
        }
    }
}