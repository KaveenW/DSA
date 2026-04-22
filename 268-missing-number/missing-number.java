class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num: nums)
        {
            mySet.add(num);
        }

        int result = 0;
        for(int i =0; i < nums.length + 1; i++){
            if(!mySet.contains(i)){
                result = i;
            }
        }

        return result;
    }
}