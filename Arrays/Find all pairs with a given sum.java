class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        
        ArrayList<pair> list=new ArrayList<>();
        Set<Long> set=new HashSet<>();
        
        for(int i=0;i<M;i++)
        {
            set.add(B[i]);
        }
        
        Arrays.sort(A);
        for(int i=0;i<N;i++)
        {
            if(set.contains(X-A[i]))
            {
                list.add(new pair(A[i],X-A[i]));
            }
        }
        
        pair[] pair=new pair[list.size()];
        return list.toArray(pair);
    }
}
