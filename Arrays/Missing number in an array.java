class Compute {
    
    public static int missingNumber(int arr[], int n)
    {
         // Your code goes here
         int sum1=0;//sum2=0;
         int tot_sum1=n*(n+1)/2;
         //int tot_sum2=n*(n+1)*((2*n)+1)/6;
         for(int i=0;i<arr.length;i++)
         {
             sum1+=arr[i];
             //sum2+=(arr[i]*arr[i]);
         }
        //  int diff1=tot_sum1-sum1;
        //  int diff2=tot_sum2-sum2;
        //  diff2=diff2/diff1;
         
         int x=tot_sum1-sum1;
         
         return x;
    }
}
