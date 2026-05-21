class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the entire first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with every other string in the array
        for (int i = 1; i < strs.length; i++) {
            // .indexOf(prefix) returns 0 if strs[i] starts with the prefix
            // If it returns anything else, it means it's not a prefix yet
            while (strs[i].indexOf(prefix) != 0) {
                // Chop off the last character of the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix gets chopped down to nothing, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}