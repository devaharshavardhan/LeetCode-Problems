class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None  # If list is empty or has one node

        curr = head
        c = 0
        while curr:
            c += 1
            curr = curr.next

        mid = c // 2  # 0-based index of the node to delete
        curr2 = head
        t = 0
        while curr2:
            if t == mid - 1:  # stop just before the middle node
                curr2.next = curr2.next.next  # skip the middle node
                break
            curr2 = curr2.next
            t += 1

        return head
