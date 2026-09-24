class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length+1];

        for(int i = 0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            int num = entry.getKey();
            int fr = entry.getValue();
            freq[fr].add(num);
        }

        int[] result = new int[k];
        int p = 0;

        for(int i = freq.length-1; i>=1; i--){
            for(int num: freq[i]){
                result[p++] = num;
                if(p == k){
                    return result;
                }
            }
        }

        return result;



    }
}
