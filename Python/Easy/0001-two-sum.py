class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        res = []
        for index, num in enumerate(nums):
            compliment = target - num
            if compliment in seen:
                return [seen[compliment], index]
            seen[num] = index
        return res
