public class SingleEleLC540{

    //https://leetcode.com/problems/single-element-in-a-sorted-array/solutions/4575226/original-approach-solo-search-alternative-approach-lone-questhttps://leetcode.com/problems/single-element-in-a-sorted-array/solutions/4575226/original-approach-solo-search-alternative-approach-lone-quest
   
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.FindSingle(new int[] { 1,1,2,3,3,4,4,8,8 }));
    }
}

class Solution {

    public int FindSingle(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) {

            mid = (right + left) / 2;

            if (mid > 0 && mid < nums.length - 1) {  //middle element is unique
                if (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid])
                    return nums[mid];  // ans found

            }

            if ((mid + 1) % 2 == 0) {  // middle element is at even position so element lies in right half
                if ((mid - 1) >= 0 && nums[mid - 1] == nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;   // left half
            } else {   // middle element is at odd position so element lies in right half
                if ((mid + 1) < nums.length && nums[mid + 1] == nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;   // left half
            }

        }
        return nums[mid]; // ans found
    }
}




