class Solution:
    def numComponents(self, head: Optional[ListNode], nums: List[int]) -> int:
        nums = set(nums)  # Convert to set for faster lookup and safe discard
        curr = head
        count = 0
        
        while curr:
            if curr.val in nums and (curr.next is None or curr.next.val not in nums):
                count += 1
            curr = curr.next
        
        return count
