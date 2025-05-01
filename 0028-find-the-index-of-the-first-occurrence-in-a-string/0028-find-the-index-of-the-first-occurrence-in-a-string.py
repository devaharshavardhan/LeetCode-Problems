#find the index
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack)):
            if i+len(needle)<=len(haystack):
                z=haystack[i:i+len(needle)]
                if z==needle:
                    return(i)
        return -1
                        
        
