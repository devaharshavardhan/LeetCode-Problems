# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        curr=head
        string=""
        while(curr):
            x=str(curr.val)
            string=string+x
            curr=curr.next
        return int(string,2)

        