class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        i = 0
        j = len(nums)-1
        mini = k
        l = []
        while(i<len(nums)):
            l.append(max(nums[0:i+1])-min(nums[i:j+1]))
            i += 1
        for i in range(len(l)):
            if(l[i]<=k):
                return i
        return -1