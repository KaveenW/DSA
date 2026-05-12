class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

    // Start from the end of the array
    for (int i = n - 1; i >= 0; i--) {
        // If the current digit is less than 9, just increment and return
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        // If it's 9, it becomes 0 and the loop continues to the next digit
        digits[i] = 0;
    }

    // If we get here, it means all digits were 9 (e.g., 999 -> 1000)
    int[] newNumber = new int[n + 1];
    newNumber[0] = 1; 
    // The rest of the array is already 0 by default in Java
    return newNumber;
    }
}