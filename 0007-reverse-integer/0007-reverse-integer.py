#reverse integer
class Solution:
    def reverse(self, x: int) -> int:
        l=(2**31)-1
        o=-(2**31)
        y=1*x
        if x<0:
            x=abs(x)
        res=0
        i=0
        while(x>0):
            z=x%10
            res=res*10+z
            i+=1
            x=x//10
        if y<0:
            res=-res
        if y>0 and res<=l:
            return res
        elif y<0  and res>=o:
            return res
        else:
            return 0
                
