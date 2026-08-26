class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        h={}
        b=[]
        for i in nums:
            h[i]=h.get(i,0)+1
        for i in h:
            if h[i]>1:
                b.append(i)
        for i in range(1,len(nums)+1):
            if i not in h:
                b.append(i)
        return b

