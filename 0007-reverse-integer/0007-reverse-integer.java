class Solution {
    public int reverse(int x) {
        int n=x;
        int reverse=0;
        int max_int=2147483647;
        int min_int=-2147483648;
        while(n!=0){
        int b=n%10;
        if(max_int/10<reverse || min_int/10>reverse){
            return 0;
        }
        reverse=reverse*10+b;
        n/=10;
    }
    return reverse;
    }
}