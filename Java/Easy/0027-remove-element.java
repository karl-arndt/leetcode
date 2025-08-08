class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int last = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i <= last && nums[i] == val) {
                nums[i] = nums[last];
                nums[last] = val;
                count++;
                last--;
            }
        }
        return nums.length - count;
    }
}