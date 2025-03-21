class Solution:
    def findLatestTime(self, s: str) -> str:
        
        x=s[:2]
        y=s[3:]
        if x[0]=="?" and x[1]=="?":
            x=x.replace("??","11")
        elif x[0]=="0" and x[1]=="?":
            x=x.replace("?","9")
        elif x[0]=='1' and x[1]=="?":
            x=x.replace("?","1")
        elif (x[1]=="0" or x[1]=="1") and x[0]=="?":
            x=x.replace("?","1")
        else:
            x=x.replace("?","0")
        if y[0]=="?" and y[1]=="?":
            y=y.replace("??","59")
        elif y[0]=="?":
            y=y.replace("?","5")
        elif y[1]=="?":
            y=y.replace("?","9")
        z=x+":"+y
        return z
        