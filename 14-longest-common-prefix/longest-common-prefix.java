class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. Handle edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 2. Start by assuming the first string is the prefix
        String prefix = strs[0];

        // 3. Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {
            // While the current string (strs[i]) doesn't start with our prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // 4. If prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}