class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length,max=-1,count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
             count++;

            else
             count=0;

            max=Math.max(max,count);  
        }

        return max;
    }
}
