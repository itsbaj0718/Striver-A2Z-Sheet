class Solution {
    public boolean isAnagram(String s, String t) {
        
        // if(s.length()!=t.length())
        //   return false;

        // int arr[]=new int[26];

        // for(int i=0;i<s.length();i++)
        // {
        //     arr[s.charAt(i)-'a']++;
        //     arr[t.charAt(i)-'a']--;
        // }

        // for(int i=0;i<26;i++)
        // {
        //     if(arr[i]!=0)
        //      return false;
        // }

        //  return true;

        // TreeSet<Character> set1=new TreeSet<>();
        // char c[]=s.toCharArray();

        // if(s.length()!=t.length())
        //  return false;

        // for(int i=0;i<s.length();i++)
        // {
        //     set1.add(c[i]);
        // }

        // TreeSet<Character> set2=new TreeSet<>();
        // char d[]=t.toCharArray();

        // for(int i=0;i<s.length();i++)
        // {
        //     set2.add(d[i]);
        // }

        // if(set1.equals(set2))
        //  return true;

        // // for(int  i=0;i<t.length();i++)
        // // {
        // //     char ch=t.charAt(i);
        // //     if(!set.contains(ch))
        // //      return false;
        // // }

        // return false;
        if(s.length()!=t.length())
        return false;
        else
        {
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        char []arr1 = t.toCharArray();
        Arrays.sort(arr1);
        int count =0;
        for(int i = 0;i<s.length();i++)
        {
            if(arr[i]!=arr1[i])
            return false;
        }
        return true;

    }
}
}
