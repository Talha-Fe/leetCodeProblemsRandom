class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> romanID = new HashMap<>();

        romanID.put('I',1);
        romanID.put('V',5);
        romanID.put('X',10);
        romanID.put('L',50);
        romanID.put('C',100);
        romanID.put('D',500);
        romanID.put('M',1000);
        
        int result = romanID.get(s.charAt(s.length()-1));

        for(int i = s.length()-2; i >= 0; i--){

            if(romanID.get(s.charAt(i)) < romanID.get(s.charAt(i+1))){

                result -= romanID.get(s.charAt(i));

            }
            else {

                result += romanID.get(s.charAt(i));

            }

        }

        return result;

    }
}
