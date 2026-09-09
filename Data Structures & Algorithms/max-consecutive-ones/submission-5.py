class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_consecutives = 0;
        new_max = 0;
        for bit in nums:
            if bit == 1:
                new_max += 1;
            else:
                if new_max > max_consecutives:
                    max_consecutives = new_max;
                new_max = 0;
        
        if new_max > max_consecutives:
            max_consecutives = new_max;

        return max_consecutives;