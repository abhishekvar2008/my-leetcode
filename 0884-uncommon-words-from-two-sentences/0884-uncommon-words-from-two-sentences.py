class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        h={}
        b=[]
        for i in s1.split():
            h[i]=h.get(i,0)+1
        for i in s2.split():
            h[i]=h.get(i,0)+1
        for i in h:
            if(h[i]==1):
                b.append(i)
        return b