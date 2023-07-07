class Sol
{
    public static int search(int arr[], int n)
    {
        // your code here
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++)
        // {
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        
        // for(int  i=0;i<arr.length;i++)
        // {
        //     if(map.get(arr[i])==1)
        //     return arr[i];
        // }
        
        // return -1;
        
        HashSet<Integer>  set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))
              set.remove(arr[i]);
              
            else
             set.add(arr[i]);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
             return arr[i];
        }
        
        return -1;
    
        // int res=0;
        // for(int i=0;i<n;i++){
        //   res=res^arr[i];}
          
        //  return res; 
    }
}
