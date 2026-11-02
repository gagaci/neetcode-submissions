class Solution {
    public int longestConsecutive(int[] nums) {
    int longest = 0;
    Set<Integer> store = new HashSet<>();
    for (Integer num : nums){
        store.add(num);
    } 

    for (Integer num : nums){
        if(!store.contains(num - 1)){
            int length = 1;
            while(store.contains(num + length)){
                length++;
            }
            longest = Integer.max(longest, length);
        }
    
    }
        return longest;
    }
}
