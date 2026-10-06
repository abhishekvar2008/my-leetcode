class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n=len(nums)
        h={}
        for i in range(0,n):
            rem=target-nums[i]
            if rem in h:
                return h[rem],i
            h[nums[i]]=i