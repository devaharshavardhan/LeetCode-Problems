class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        c=0
        h={0:1}
        cs=0
        for i in nums:
            cs=cs+i
            if cs-k in h:
                c=c+h[cs-k]
            h[cs]=h.get(cs,0)+1
        return c
