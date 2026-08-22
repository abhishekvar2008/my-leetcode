class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int a=n;
        while(n!=0){
            int b=n%10;
            sum+=b;
            mul*=b;
            n/=10;
        }
        int res=mul+sum;
        if(a%res==0){
            return true;
        }
        return false;

    }
}