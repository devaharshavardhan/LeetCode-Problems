class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        i1=0
        x=nums.count(0)
        i2=0
        y=nums.count(1)
        i3=0
        z=nums.count(2)
        for i in range(len(nums)):
            if nums[i]==0 and x>0:
                nums[i1],nums[i]=nums[i],nums[i1]
                i1+=1
                x-=1
        i2=i1+i2
        for i in range(len(nums)):
            if nums[i]==1 and y>0:
                nums[i2],nums[i]=nums[i],nums[i2]
                i2+=1
                y-=1
        i3=i2+i3
        for i in range(len(nums)):
            if nums[i]==2 and z>0:
                nums[i3],nums[i]=nums[i],nums[i3]
                i3+=1
                z-=1
        return nums
        