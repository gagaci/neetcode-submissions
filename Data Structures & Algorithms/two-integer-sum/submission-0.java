class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(seen.containsKey(need)){
                return List.of(seen.get(need), i).stream().mapToInt(Integer::intValue).toArray();
            }
            seen.put(nums[i], i);
        }
            return new int[]{};
    }
}
