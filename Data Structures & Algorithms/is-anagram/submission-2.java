class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) return false;
        List<Character> sArray = new ArrayList<>(s.chars().mapToObj(c -> (char) c).toList());
        List<Character> tArray = t.chars().mapToObj(c -> (char) c).toList();
        for (Character c : tArray) 
        sArray.remove(c);
        return sArray.isEmpty();
    }
}
