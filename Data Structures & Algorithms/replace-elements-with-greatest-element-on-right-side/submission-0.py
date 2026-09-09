class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        last = -1;
        for i in range(len(arr) - 1, -1, -1):
            current = arr[i];

            if last > current:
                arr[i] = last;
            else:
                arr[i] = last;
                last = current;

        return arr;
                

