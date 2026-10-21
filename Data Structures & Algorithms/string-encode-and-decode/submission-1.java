class Solution {

    public String encode(List<String> strs) {
    StringBuilder result = new StringBuilder();
    for (String str : strs) {
      result.append(str.length()).append("#").append(str);
    }
    return result.toString();
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int pos = 0;
    while (pos < str.length()) {
      int hash = str.indexOf('#', pos);
      int length = Integer.parseInt(str.substring(pos, hash));

      int wordStart = hash + 1;
      int wordEnd = wordStart + length;
      result.add(str.substring(wordStart, wordEnd));

      pos = wordEnd;
    }

    return result;
    }
}