public class SearchInSortedIILC81 {

    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.search(new int[] { 1,0,1,1,1 }, 0));
    }
}

class Solution {

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) 
        {
            mid = (right + left) / 2;

            if (nums[mid] == target)
                return true;

                if(nums[left]==nums[mid] && nums[mid] == nums[right])
                {
                      left++;
                      right--;
                      continue;
  
                }

            if (nums[left] <= nums[mid]) // left half is sorted , =  for two sized array
            {
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1; // target lies in left half
                else
                    left = mid + 1; // target lies in right half
            } else // right half is sorted
            {
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1; // target lies in right half
                else
                    right = mid - 1; // target lies in left half
            }
        }
        return false; // ans not found
    }
}