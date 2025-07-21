import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int compliment;
        for (int i = 0; i < nums.length; i++) {
            compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                ans[0] = map.get(compliment);
                ans[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}