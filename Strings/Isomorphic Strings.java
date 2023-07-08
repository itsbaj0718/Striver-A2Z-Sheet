class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
        // int arr1[]=new int[26];
        // int arr2[]=new int[26];

        // for(int i=0;i<s.length();i++)
        // {
        //     arr1[s.charAt(i)-'a']++;
        //     arr2[t.charAt(i)-'a']++;
        // }  
        
        // Arrays.sort(arr1); Arrays.sort(arr2);
        
        // if(arr1==arr2)
        //  return true;

        // else
        //  return false; 

        // HashMap<Character,Character> map1=new HashMap<>();
        // HashMap<Character,Character> map2=new HashMap<>();
        
        // int res1=0,res2=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch1=s.charAt(i);
        //     char ch2=t.charAt(i);
        //     if(map1.containsKey(ch1))
        //     {
        //         if(!(map1.get(ch1)==ch2))
        //         res1=1;
        //         break;
        //     }
        //     else{
        //      map1.put(ch1,ch2);}
        // }

        // for(int i=0;i<t.length();i++)
        // {
        //     char ch1=s.charAt(i);
        //     char ch2=t.charAt(i);
        //     if(map2.containsKey(ch2))
        //     {
        //         if(!(map2.get(ch2)==ch1))
        //         res2=1;
        //         break;
        //     }
        //     else{
        //      map2.put(ch2,ch1);}
        // }
        
        // if(res1==1 || res2==1)
        //  return false;

        // return true; 

        if(s.length()!=t.length())
          return false;

        int arr1[]=new int[256];
        int arr2[]=new int[256];
        
        for(int i=0;i<s.length();i++)
        {
            if(arr1[s.charAt(i)]!=arr2[t.charAt(i)])
             return false;

            arr1[s.charAt(i)]=i+1;
            arr2[t.charAt(i)]=i+1; 
        }

        return true;

        
        
    }
}
