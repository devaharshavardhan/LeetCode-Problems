class Solution:
    def addBinary(self, a: str, b: str) -> str:
        x=int(a,2)
        y=int(b,2)
        res=bin(x+y)
        return str(res[2:])
       
        

        