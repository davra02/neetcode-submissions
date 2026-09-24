class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prodI = new int[n];
        int[] prodD = new int[n];
        int ac = 1;

        for(int i = 0; i<=n-1; i++){
            prodI[i] = ac;
            ac *= nums[i];
        }

        ac = 1;

        for(int i = n-1; i>=0; i--){
            prodD[i] = ac;
            ac *= nums[i];
            
        }
        
        int[] result = new int[n];

        for(int i=0; i<=n-1; i++){
            result[i] = prodI[i] * prodD[i];
        }
        return result;
    }
}  
