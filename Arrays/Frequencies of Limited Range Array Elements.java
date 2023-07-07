class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int p)
    {
        // code here
        
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=map.getOrDefault(i,0);
        }
    }
}
