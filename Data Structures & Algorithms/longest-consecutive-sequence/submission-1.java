class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i<= nums.length-1; i++){
            seen.add(nums[i]);
        }

        int longest = 0;

        for(int value:seen){
            if(!seen.contains(value-1)){
                int num = value;
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
