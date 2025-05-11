class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        '''x=[[1],[1,1]]
        if numRows==1:
            x.pop()
            return x
        elif numRows==2:
            return x
        elif numRows>2:
            for i in range(2,numRows):
                c=[]
                for j in range(len(x[i:])):
                    if j==0:'''
        result=[]
        for i in range(numRows):
            if i==0:
                result.append([1])
            elif i==1:
                result.append([1,1])
            else:
                b=[1,1]
                
                first=0
                last=1
                while (first<i-1) and (last<=i-1):
                    b.insert(first+1,sum(result[i-1][first:last+1]))
                    first+=1
                    last+=1
                result.append(b)
        return result

                         


        