class Solution:
    def longestAlternatingSubarray(self, n: List[int], threshold: int) -> int:
        l = 0
        r = 0
        res = 0
        z = 0
        while l < len(n):
            if r < len(n) and n[l] % 2 == 0:
                if max(n[l:r+1]) <= threshold:
                    f = True
                    subarr = n[l:r+1]
                    for i in range(len(subarr) - 1):
                        if subarr[i] % 2 == subarr[i + 1] % 2:
                            f = False
                            break   
                    if f:
                        if len(subarr) > z:
                            res = subarr
                            z = len(res)
                r += 1
            else:
                l += 1
                r = l
        return z
