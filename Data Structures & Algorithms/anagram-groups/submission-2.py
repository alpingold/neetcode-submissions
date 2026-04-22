class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sets={}

        for word in strs:
            comp = "".join(sorted(word))
            if comp in sets.keys():
                sets[comp].append(word)
            else:
                sets[comp]=[word]
        return[x for x in sets.values()]