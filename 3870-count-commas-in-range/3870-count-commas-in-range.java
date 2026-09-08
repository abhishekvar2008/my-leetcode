class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        // else if(n>=1000 && n<10000){
        //     int c=(n+1)-1000;
        //     return c;
        // }
        // else if(n>=10000 && n<100000){
        //     int c=(n+1)-1000;
        //     return c;
        // }
        else{
            return (n+1)-1000;
        }
    }
}