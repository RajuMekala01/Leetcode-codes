class Solution(object):
    def isAnagram(self, s, t):
        if len(s)!=len(t):
            return False
        res_s=sorted(s)
        res_t=sorted(t)
        if res_s==res_t:
            return True
        return False
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        