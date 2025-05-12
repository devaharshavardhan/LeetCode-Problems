class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        z=len(nums)//2
        for i in nums:
            if nums.count(i)>z:
                return i
        
        
        