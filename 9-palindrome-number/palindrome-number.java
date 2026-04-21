class Solution {
    public boolean isPalindrome(int x) {
        
        int left = 0;
        String num = String.valueOf(x);
        int right = num.length() - 1;

        while(left < right){

            if(num.contains("-")){
                return false;
            }

            while(left < right && !Character.isLetterOrDigit(num.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(num.charAt(right))){
                right--;
            }

            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}