import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] sorted = new List[nums.length + 1];
        int[] ans = new int[k];

        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sorted[entry.getValue()].add(entry.getKey());
        }

        int ansIndex = 0;
        for (int i = nums.length; i > 0 && ansIndex < k; i--) {
            for (int n : sorted[i]) {
                ans[ansIndex++] = n;
                if (ansIndex == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}