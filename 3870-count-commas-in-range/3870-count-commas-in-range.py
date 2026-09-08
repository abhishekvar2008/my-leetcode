class Solution:
    def countCommas(self, n: int) -> int:
        if(n<1000):
            return 0
        elif(n>=1000 and n<10000):
            c=(n+1)-1000
            return c
        elif(n>=10000 and n<100000):
            c=(n+1)-1000
            return c
        else:
            return (n+1)-1000
        