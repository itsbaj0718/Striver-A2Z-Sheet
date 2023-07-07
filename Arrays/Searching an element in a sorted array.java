class Solution{
    static int searchInSorted(int arr[], int n, int k)
    {
        
        // Your code here
        for(int i=0;i<n;i++)
        {
            if(k==arr[i])
              return 1;
        }
        
        return -1;
        
    }
}
