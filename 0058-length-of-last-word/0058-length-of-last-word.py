class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x=[]
        s=s.strip()
        if len(s)==1:
            return 1
        else:
            for i in s:
                if i!=" ":
                    x.append(i)
                elif ord(i)==32:
                    x.clear()
        return len(x)