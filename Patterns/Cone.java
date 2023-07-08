*********
 *******
  *****
   ***
    *

  class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=(2*i)-1;k>=1;k--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
