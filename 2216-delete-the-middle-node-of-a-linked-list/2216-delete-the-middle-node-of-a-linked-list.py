class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# Your Solution class
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None  # Return None for empty or 1-element list
        curr = head
        c = 0
        while curr:
            c += 1
            curr = curr.next
        mid = c // 2
        temp = None
        curr2 = head
        t = 0
        while t != c:
            if t == mid:
                temp.next = curr2.next  # Skip the middle node
                break
            temp = curr2
            curr2 = curr2.next
            t += 1
        return head

# Helper to create a linked list from a list
def build_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head