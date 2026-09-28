class Solution {
    public boolean isAnagram(String s, String t) {
    List<Character> sArray = new ArrayList<>(s.chars().mapToObj(c -> (char) c).toList());
    List<Character> tArray = new ArrayList<>(t.chars().mapToObj(c -> (char) c).toList());

    Collections.sort(sArray);
    Collections.sort(tArray);
    
    return sArray.equals(tArray);
    }
}
