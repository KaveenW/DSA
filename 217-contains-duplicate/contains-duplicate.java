class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        
        for (int num : nums) {
            mySet.add(num);
        }

        // If the set is smaller than the array, it means duplicates were filtered out
        return mySet.size() < nums.length;
    }
}