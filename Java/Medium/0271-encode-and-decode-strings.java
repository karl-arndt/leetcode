import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        String res = "";
        for (String s : strs) {
            res += s.length() + "#" + s;
        }
        return res;
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int index = 0;

        while (index < str.length()) {
            int end = index;
            while(str.charAt(end) != '#') {
                end++;
            }
            int length = Integer.parseInt(str.substring(index, end));
            index = end + 1;
            end = index + length;
            list.add(str.substring(index, end));
            index = end;
        }
        return list;
    }
}