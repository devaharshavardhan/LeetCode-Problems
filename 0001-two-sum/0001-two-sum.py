#Here the code starts
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        x = []
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    if len(x) < 2:
                        x.append(i)
                        x.append(j)
                        break
                else:
                    continue
        return x
