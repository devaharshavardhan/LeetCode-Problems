
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        temp = prices[0]
        res = 0

        for i in prices[1:]:
            if temp > i:
                temp = i
            v=i - temp
            res = max(res,v)
        
        return res
           

     

        