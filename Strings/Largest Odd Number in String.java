class Solution {
    public String largestOddNumber(String num) {
        int len=num.length();

        while(len>0)
        {
            if((num.charAt(len-1)-'0')%2==1)  break;

            len--;
        }

        return num.substring(0,len);
    }
}
