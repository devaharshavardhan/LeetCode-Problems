from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        v = {}
        for i in strs:
            z = ''.join(sorted(i))  # sorted version of string
            print(z)
            if z in v:
                v[z].append(i)
            else:
                v[z] = [i]  # ✅ wrap string in a list
        print(list(v.values()))
        return list(v.values())  # add return for use
