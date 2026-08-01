class Solution(object):
    def reverseWords(self, s):
        r=""
        a=s.split()
        a.reverse()
        res=" ".join(a)
        return res


        """
        :type s: str
        :rtype: str
        """
        