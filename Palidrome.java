class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String fliteredString = "";
        for(char c: s.toCharArray()) {
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                fliteredString += c;
            }
        }
        int start = 0;
        int end = fliteredString.length()-1;
        while(start < end) {
            if(fliteredString.charAt(start) != fliteredString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
    
