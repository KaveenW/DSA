class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int size = nums.length;

        for(int i = 0; i < size; i++)
        {
            int complement = target - nums[i];
            if(myMap.containsKey(complement)){
                return new int[]{myMap.get(complement), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{};
    }
}