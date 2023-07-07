class Solution {
    public static int longestOnes(int n, int[] arr, int k) {
        // code here
        int l=0,r=0,max=-1,zero=0;
        
        while(r<n)
        {
            if(arr[r]==0)
             zero++;
            
            while(l<r && zero>k)
            {
                if(arr[l]==0)
                 zero--;
                 
                l++; 
            }
            
            max=Math.max(max,(r-l+1));
            r++;
        }
        
        return max;
    }
}
