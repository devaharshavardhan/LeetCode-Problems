from typing import List

class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        n = len(nums)
        prefix = [0] * (n + 1)

        # Step 1: Build prefix sum
        for i in range(n):
            prefix[i + 1] = prefix[i] + nums[i]

        res = float('inf')
        found = False

        # Step 2: Try all subarray lengths from l to r
        for size in range(l, r + 1):
            for start in range(n - size + 1):
                end = start + size
                sub_sum = prefix[end] - prefix[start]
                if sub_sum > 0:
                    res = min(res, sub_sum)
                    found = True

        return res if found else -1
