class Solution:
    def minimumSubarrayLength(self, nums: List[int], k: int) -> int:
        f=float('inf')
        for i in range(len(nums)):
            res=0
            for j in range(i,len(nums)):
                res=res|nums[j]
                if res>=k:
                    f=min(f,j-i+1)
        if f!=float('inf'):
            return f
        else:
            return -1
     
        