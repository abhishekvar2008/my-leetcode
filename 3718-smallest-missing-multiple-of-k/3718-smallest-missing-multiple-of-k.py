class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        a=len(nums)
        for i in range(1,a+1):
            b=k*i
            if b not in nums:
                return b
        return k*(len(nums)+1)
