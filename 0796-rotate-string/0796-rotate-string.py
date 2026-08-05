class Solution(object):
    def rotateString(self, s, goal):
        double_s=s+s
        if len(s)!=len(goal):
            return False
        if goal in double_s:
            return True
        return False


        
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        