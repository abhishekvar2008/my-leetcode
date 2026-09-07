class Solution {
    public int sod(int n){
        int s=0;
        while(n!=0){
            int b=n%10;
            s+=(b*b);
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast != 1){
            slow=sod(slow);
            fast=sod(sod(fast));
            if(fast==slow & slow!=1){
                return false;
            }
        }  
        return true;
    }

}