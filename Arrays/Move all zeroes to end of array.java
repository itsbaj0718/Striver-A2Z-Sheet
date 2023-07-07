class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
             arr[pos++]=arr[i]; 
        }
        
        for(int i=pos;i<n;i++)
         arr[i]=0;
    }
}
