class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        nums.sort()
        res=float('-inf')
        if len(nums)==1:
            return 0
        for i in range(len(nums)-1):
            t=nums[i+1]-nums[i]
            res=max(res,t)
        return abs(res)
            
        