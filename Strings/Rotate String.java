class Solution {
    public boolean rotateString(String s, String goal) {
        
        // char find=s.charAt(0);int pos=0;
        // for(int i=0;i<goal.length();i++)
        // {
        //    char ch=goal.charAt(i);
        //    if(ch==find)
        //    {
        //        pos=i;
        //        String word=goal.substring(pos,goal.length())+goal.substring(0,pos);
        //         if(word.equals(s))
        //           return true;
        //    }
        // }
        //  return false; 

        return(s.length()==goal.length() && (s+s).contains(goal));
    }
}
