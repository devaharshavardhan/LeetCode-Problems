# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return 
        c=0
        curr=head
        temp=head
        while(curr):
            c+=1
            curr=curr.next
        mid=c//2
        #print(mid)
        #print(c)
        k=0
        while(temp):
            if k==mid:
                return temp
            k+=1
            temp=temp.next