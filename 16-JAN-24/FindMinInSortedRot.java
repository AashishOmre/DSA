public class FindMinInSortedRot {
    //https://www.enjoyalgorithms.com/blog/minimum-in-sorted-and-rotated-array
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.FindMin(new int[]{4,5,6,1,2,3}));

    }
}

class Solution {

    public int FindMin(int[] nums) {

        int left=0;
        int right=nums.length-1;
        int mid=0;

        while(left <= right)
        {
            mid=(left+right)/2;

            if(nums[mid] <  nums[right])
               right=mid;
            else
               left=mid-1;   
        }

        return nums[mid];
    }

}
