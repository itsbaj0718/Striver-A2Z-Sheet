class Solution {
    int print2largest(int arr[], int n) {
      Arrays.sort(arr);
        if(arr[0]==arr[n-1])
         return -1;
         
        int index=n-2;
        while(arr[index]==arr[n-1])
          index--;
          
          return arr[index];
    }
}
