class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num: nums)
        {
            mySet.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++)
        {
            if(!mySet.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}