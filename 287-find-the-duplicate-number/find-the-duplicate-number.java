class Solution {
    public int findDuplicate(int[] nums)
    {
        int dp=nums[0];
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                dp=nums[i];
                break;
            }
        }
        return dp;
    }
}