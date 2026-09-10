class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = 0;

        Map<Integer, Integer> indexes = new HashMap<>();

        for(i = 0; i<n; i++){
            int eval = target - nums[i];
            if(indexes.containsKey(eval)){
                j = i;
                i = indexes.get(eval);
                break;
            }
            indexes.put(nums[i], i);
        }

        return new int[]{i, j};
    }
}
