#class
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=0
        l=[]
        while(i<len(nums)):
            if nums[i] not in l:
                l.append(nums[i])
                i=i+1
            else:
                nums.pop(i)
        return i


        
