class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        n=len(nums)
        res=float('-inf')
        ws=sum(nums[:k])
        res=ws
        for i in range(k,len(nums)):
            ws=ws-nums[i-k]+nums[i]
            res=max(ws,res)
        return res/k

        