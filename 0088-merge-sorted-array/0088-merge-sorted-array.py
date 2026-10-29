class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        a=[]
        for i in range(m):
            a.append(nums1[i])
        c=sorted(a+nums2)
        for i in range(len(c)):
            nums1[i]=c[i]
        return nums1
        