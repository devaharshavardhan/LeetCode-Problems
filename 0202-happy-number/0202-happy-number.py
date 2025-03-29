class Solution:
    def isHappy(self, n: int) -> bool:
        x=0
        temp=0
        while(n>0):
            y=n%10
            x=x+(pow(y,2))
            n=n//10
            if n==0:
                n=x
                temp=x
                x=0
            if temp==1:
                return True
            if temp==4:
                return False
            
        