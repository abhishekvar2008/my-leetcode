class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        c=sorted(nums1 + nums2)
        if(len(c)%2==1):
            return c[len(c)//2]
        else:
            return (c[len(c)//2 -1] + c[len(c)//2])/2.0

        