class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        x=len(strs)
        if x==0:
            return ""
        if x==1:
            return strs[0]
        strs.sort()
        z=min(len(strs[0]),len(strs[x-1]))
        i=0
        while i <z and strs[0][i]==strs[x-1][i]:
            i+=1
        f=strs[0][:i]
        return f

        
        