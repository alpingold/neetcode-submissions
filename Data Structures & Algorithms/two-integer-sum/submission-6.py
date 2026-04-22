class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indicies={

        }
        for x in range(len(nums)):
            if target-nums[x] in indicies.keys():
                return[indicies.get(target-nums[x]),x]
            else:
                indicies.update({nums[x]:x})
        return[0,0]