class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, Integer> seen = new HashMap<>();
        int j = 0;
        for(int i = 0; i<n; i++){
            String current = strs[i];
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(seen.containsKey(sorted)){
                anagrams.get(seen.get(sorted)).add(current);
            }else{
                List<String> newAnagram = new ArrayList<>();
                newAnagram.add(current);
                anagrams.add(newAnagram);
                seen.put(sorted, j);
                j++;
            }

        }
        return anagrams;
    }
}
