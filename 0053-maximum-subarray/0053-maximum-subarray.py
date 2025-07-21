class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cs=nums[0]
        res=nums[0]
        for i in nums[1:]:
            cs=max(i,cs+i)
            res=max(res,cs)
        return res
                