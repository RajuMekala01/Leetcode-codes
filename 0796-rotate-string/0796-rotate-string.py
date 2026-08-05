class Solution(object):
    def rotateString(self, s, goal):
        cur_s=s
        n=len(cur_s)
        if len(s)!=len(goal):
            return False
        for i in range(0,n):
            if cur_s==goal:
                return True
            cur_s=cur_s[-1]+cur_s[:-1]
        return False 



        
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        