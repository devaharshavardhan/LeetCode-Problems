class Solution:
    def longestPalindrome(self, s: str) -> str:
        k=1
        n=len(s)
        for i in range(n):
            for j in range(n-k+1):
                x=s[j:j+k]
                c=x[::-1]
                if x==c:
                    res=s[j:j+k]
            k+=1
        return res
        