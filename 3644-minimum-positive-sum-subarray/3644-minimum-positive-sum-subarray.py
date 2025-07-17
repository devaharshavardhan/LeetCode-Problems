class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        res=float('inf')
        c=0
        for i in range(l,r+1):
            for j in range(len(nums)-i+1):
                z=sum(nums[j:i+j])
                print(z)
                if z>0:
                    c+=1
                    res=min(res,z)
        if c>0:
            return res
        else:
            return -1
                

        