class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        z=nums1+nums2
        z.sort()
        if len(z)%2==0:
            x=len(z)//2
            res=(z[x]+z[x-1])/2
        else:
            x=len(z)//2
            res=z[x]
        return res
        