class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int in = n-1;
        int im = m-1;
        if(n == 0) return;
       for(int i=m+n-1; i>=0; i--){

            if(in<0){
                nums1[i] = nums1[im];
                im--;
            }else if(im<0){
                nums1[i] = nums2[in];
                in--;
            }else{
                if(nums1[im] >= nums2[in]){
                    nums1[i] = nums1[im];
                    im--;
                }else{
                    nums1[i] = nums2[in];
                    in--;
                }
            }
            
            
            
        
            
        
        
       }
    }
}