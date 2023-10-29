class Solution {
    public int reverse(int x) {
        int h= -2147483648;
          int k=2147483647;
     
     long rev = 0;
        while(x!=0)
        {
            rev = rev * 10 + x% 10;
            x = x / 10;
        }
         if (rev > k || rev< h) {
            return 0;
        }
       
        else{
            return(int) rev;

        }
          
       
        
    }
}