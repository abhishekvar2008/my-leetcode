class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        b=[]
        nums=sorted(nums)
        for i in range(len(nums)):
            if nums[i]==target:
                b.append(i)
        return b
                