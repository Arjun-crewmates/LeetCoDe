class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = words[i];
            if (map1.containsKey(key)) {
                if (!map1.get(key).equals(value)) {
                    return false;
                }
            }
            if (map2.containsKey(value)) {
                if (!map2.get(value).equals(key)) {
                    return false;
                }
            }
            map1.put(key, value);
            map2.put(value, key);
        }
        return true;
    }
}