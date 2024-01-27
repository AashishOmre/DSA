public class SearchInSortedILC33 {

    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.search(new int[] { 5, 6, 7, 8, 0, 1 }, 8));
    }
}

class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) 
        {
            mid = (right + left) / 2;

            if (nums[mid] == target)
                return mid;

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
        return -1; // ans not found
    }
}