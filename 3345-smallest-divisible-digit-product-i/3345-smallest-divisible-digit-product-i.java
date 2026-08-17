class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int a=n;
            int mul=1;
            while(a!=0){
                mul*=a%10;
                a/=10;
            }
            if(mul%t==0){
                return n;
            }
            n+=1;
            
        }
    }
}