class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        j=0
        for i in range(len(nums1)-m):
            nums1.pop()
        for j in range(n):
            nums1.append(nums2[j])
        nums1.sort()