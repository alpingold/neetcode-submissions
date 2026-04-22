class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        vals={

        }
        for i in range(len(nums)):
            difference = target-nums[i]
            if difference in vals:
                return[vals[difference],i]
            vals[nums[i]]=i