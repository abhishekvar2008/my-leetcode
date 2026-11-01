class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        a={}
        for i in nums:
            a[i]=a.get(i,0)+1
        for i in a:
            if(a[i]==1):
                return i