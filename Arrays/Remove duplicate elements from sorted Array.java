class Solution {
    int remove_duplicate(int arr[],int n){
        // code here
        int j=0;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        
        return 
    }
}
