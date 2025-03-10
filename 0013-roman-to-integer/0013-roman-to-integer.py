class Solution:
    def romanToInt(self, s: str) -> int:
        r=["I","V","X","L","C","D","M"]
        v=[1,5,10,50,100,500,1000]
        sux=[]
        su=0
        i=0
        if len(s)==1:
                    e=r.index(s[i])
                    sux.append(v[e])
        else:
            
            while (i<len(s)):
                while (i<len(s)):
                    su=0
                    if s[i] in r:
                        x=r.index(s[i])
                    if i+1<len(s) and s[i+1] in r:
                        y=r.index(s[i+1])
                    if(v[x]<v[y]):
                        su=v[y]-v[x]
                        sux.append(su)
                        i=i+2
                        x=0
                        y=0
                        break
                    elif (v[x]==v[y]):
                        sux.append(v[x])
                        i=i+1
                        x=0
                        y=0
                        break
                    else:
                        
                        sux.append(v[x])
                        i=i+1
                        x=0
                        y=0
                        break
        return sum(sux)