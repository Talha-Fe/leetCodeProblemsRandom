class Solution {
    public int reverse(int x) {

        String revL = Integer.toString(x);
        long rev = 0;
        int mult = 0;
        int kalan = x%10;
        
        if(x<0){
            mult = (int) Math.pow(10, revL.length() -2 );
        }
        else{
            mult = (int) Math.pow(10, revL.length() -1 );
        }

        int absVal = Math.abs(x);

        if(x >= 2147483647 || x <= -2147483648 || (revL.length() >= 10 && kalan > 2 )) {
            return 0;
        }

        while(x != 0){
            
            rev += (x % 10)*mult;
            x = x / 10;
            mult = mult / 10;

            if(rev > 2147483647 || rev < -2147483648 || (revL.length() >= 10 && kalan > 2 )) {
                    return 0;
            }

        }



        if(x<0){
            rev = (rev*-1);
        }

        return (int) rev;


    }
}
