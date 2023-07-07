class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int zero=0,max=-1,l=0,r=0;
        
        while(r<n)
        {
            if(arr[r]==0)
             zero++;
             
            while( zero > m)
            {
                if(arr[l]==0)
                 zero--;
                 
                l++; 
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        
        return max;
        
        
    }
}
