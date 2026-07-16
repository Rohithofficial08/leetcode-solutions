// Factorial Trailing Zeroes [Medium]
// https://leetcode.com/problems/factorial-trailing-zeroes/


class Solution {
    public int trailingZeroes(int n) {
        int count =0;

        
        int i = 1;
         
        while(true){
           int s = (int) Math.pow(5,i);
           if(s>n){
            break;
           }

           count += n/s;
           i++;
         
        }

        return count;
    }
    
}