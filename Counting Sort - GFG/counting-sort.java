//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        char[] charArr = arr.toCharArray();

    for (int i = 1; i < charArr.length; i++) {
        char curr = charArr[i];
        int j = i - 1;
        while (j >= 0 && curr < charArr[j]) {
            charArr[j + 1] = charArr[j];
            j--;
        }
        charArr[j + 1] = curr;
    }

    return new String(charArr);


    }
}