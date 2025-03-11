class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i=0
        while(i<len(nums)):
            z=nums[i]
            if(z!=val):
                i=i+1
                continue
            elif(z==val):
                nums.pop(i)
                #i=i-1
                if len(nums)==0:
                    break
        return i
                