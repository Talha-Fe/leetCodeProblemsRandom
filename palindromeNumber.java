class Solution {
    public boolean isPalindrome(int x) {

        String strNumBase = Integer.toString(x);
        String strNumReverse = "";

        for(int i = strNumBase.length() - 1; i >= 0 ; i--){

            strNumReverse += strNumBase.charAt(i);

        }

        if(strNumReverse.equals(strNumBase)){
            return true;
        }
        else{
            return false;
        }

    }

}
