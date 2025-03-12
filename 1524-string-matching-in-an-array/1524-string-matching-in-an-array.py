class Solution:
    def stringMatching(self, w: List[str]) -> List[str]:
        res=[]
        x=0
        for i in w:
            for j in w:
                if i in j and i!=j and i not in res:
                    res.append(i)
        return res

