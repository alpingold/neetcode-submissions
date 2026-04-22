class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = {}
        for index, num in enumerate(nums):
            rance=target-num
            if rance in diff:
                return[diff[rance],index]
            diff[num]=index
        return nums