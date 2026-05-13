class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int left = 0;
        int right = n-1;
        int mid = (left + right)/2;
        while(left <= right)
        {
            mid = (left + right)/2;

            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }
        if(nums[mid]<target)
            return mid+1;
        else
            return mid;
    }
}