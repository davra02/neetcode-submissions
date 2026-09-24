class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i<= nums.length-1; i++){
            seen.add(nums[i]);
        }

        int longest = 0;

        for(int i = 0; i<= nums.length-1; i++){
            if(!seen.contains(nums[i]-1)){
                int num = nums[i];
                int seq = 0;
                while(seen.contains(num)){
                    seq++;
                    num++;
                }
                if(seq>longest) longest = seq;
            }
        }

        return longest;
    }
}
