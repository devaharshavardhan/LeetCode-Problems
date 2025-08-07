class Solution:
    def totalFruit(self, fruits: List[int]) -> int:

        b={}
        left=0
        res=0
        for i in range(len(fruits)):
            curr=fruits[i]
            b[curr]=b.get(curr,0)+1
            while(len(b)>2):
                pre=fruits[left]
                b[pre]-=1
                if b[pre]==0:
                    del b[pre]
                left+=1
            res=max(res,i-left+1)
        return res
        