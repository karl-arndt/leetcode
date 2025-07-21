import java.util.HashMap;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr1 = s.charAt(i);
            char curr2 = t.charAt(i);
            if (map1.containsKey(curr1)) {
                map1.put(curr1, map1.get(curr1) + 1);
            }  else {
                map1.put(curr1, 1);
            }
            if (map2.containsKey(curr2)) {
                map2.put(curr2, map2.get(curr2) + 1);
            } else {
                map2.put(curr2, 1);
            }
        }
        return map1.equals(map2);
    }
}