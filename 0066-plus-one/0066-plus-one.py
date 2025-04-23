class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        x=0
        y=[]
        for i in digits:
            x=x*10+i
        x+=1
        while(x>0):
            z=x%10
            y.append(z)
            x=x//10
        return y[::-1]

        