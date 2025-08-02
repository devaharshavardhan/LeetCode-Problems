# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        x=set(nums)
        while head and  head.val in x:
            head=head.next
        if head is None:
            return None
        prev=None
        curr=head
        while(curr):
            if curr.val in x:
                prev.next=curr.next
                curr=curr.next
            else:
                prev=curr
                curr=curr.next
        return head