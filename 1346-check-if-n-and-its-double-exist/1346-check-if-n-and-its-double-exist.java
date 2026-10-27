class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int a= arr[i];
            for(int j=0;j<arr.length;j++){
                if(i !=j && a==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}