class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        b=[]
        for i in range(len(nums)):
            a=nums[i]
            s=0
            while(a!=0):
                c=a%10
                s+=c
                a//=10
            if(s==i):
                b.append(s)
                
        if(len(b)==0):
            return -1
        else:
            return min(b)