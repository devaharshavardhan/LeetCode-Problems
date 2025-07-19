class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        k=3
        c=0
        for i in range(len(nums)-k+1):
            if nums[i]+nums[i+k-1]==nums[i+1]/2:
                c+=1
        return c

        