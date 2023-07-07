class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0,r=0,end=0,begin=0,n=s.length();
        
        if(s==null || s.length()==0)
         return 0;

        while(r<n)
        {
            
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            if(end-begin < r-l)
            {
                end=r;
                begin=l;
            }
            r++;
        }

        return end-begin+1;
    }
}
