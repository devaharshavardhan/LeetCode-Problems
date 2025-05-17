class Solution:
    def hammingWeight(self, n: int) -> int:
        x=str(bin(n))
        y=x.count('1')
        return y
        