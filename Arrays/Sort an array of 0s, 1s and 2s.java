class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        //oc - one's counter
        int oc = 0;
        //tc - two's counter
        int tc = 0;
        
        for(int k=0; k<a.length; k++){
            //count no of one's
            if(a[k]==1)
                oc++;
            //count no of two's
            else if(a[k]==2)
                tc++;
            //make current element zero
            //later we only have to update one's and two's in the array
            a[k]=0;
        }
        
        //calculate no of zeroes
        //no of zeroes (x) = array length - one's count - two's count
        int x = n - oc - tc;
        //start from x(no of zeroes) position 
        //as we have already made all elements as zeroes in previous iteration
        //we dont' have to update zeroes again
        for(int i=x; i<n; i++){
            //update the current the element as 1 until one's counter is greater than zero
            if(oc>0){
                a[i]=1;
                //decrement one's counter after updating current element as 1
                oc--;
            }
            else
                //if one's counter reaches zero then the remaining elements should be 2's
                a[i]=2;
        }
    } 
}
