class Solution(object):
    def searchInsert(self, nums, target):
        n=len(nums)
        low=0
        high=n-1
        res=n
        while low<=high:
            mid=(low+high)//2
            if nums[mid]>=target:
                res=mid
                high=mid-1
            else:
                low=mid+1
        return res

        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        