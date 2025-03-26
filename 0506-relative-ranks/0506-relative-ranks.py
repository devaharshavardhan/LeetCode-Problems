class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        
        cpy=score.copy()
        score.sort()
        res=[]
        hs={}
        j=0
        for i in range(len(score)-1,-1,-1):
            if j==0:
                hs[score[i]]="Gold Medal"
            elif j==1:
                hs[score[i]]="Silver Medal"
            elif j==2:
                hs[score[i]]="Bronze Medal"
            else:
                hs[score[i]]=str(j+1)
            j+=1
        print(hs)
        for i in cpy:
            res.append(hs[i])
        return res