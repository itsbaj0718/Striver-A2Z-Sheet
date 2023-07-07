class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        rotation(arr,0,n-1);
        rotation(arr,0,k-1);
        rotation(arr,k,n-1);
    }
        public void rotation(int arr[],int start,int end)
        {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        }
}
