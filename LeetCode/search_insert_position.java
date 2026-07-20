// Search Insert Position [Easy]
// https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int st = 0;
        int en = nums.length - 1;
        
        while(st<=en){
            int mid = en+(st-en)/2;
            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                st = mid+1;
            }
            else{
             en = mid -1;   
            }

        }
        return st;
    }
}