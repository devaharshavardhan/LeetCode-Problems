from collections import Counter
class Solution:
    def maximumLengthSubstring(self, s: str) -> int:
        l=0
        r=l+1
        x=0
        while(l<len(s) and r<len(s)+1):
            res=''.join(s[l:r])
            z=Counter(res)
            for i in z:
                if all(count <= 2 for count in z.values()):
                    x=max(x,len(s[l:r]))
            r=r+1
            if r==len(s)+1:
                l+=1
                r=l+1
        return x
                
        
        
        
        
        
        