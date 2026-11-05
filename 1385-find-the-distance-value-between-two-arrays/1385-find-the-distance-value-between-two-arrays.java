class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int b =0;
        for(int i =0;i<arr1.length;i++){
            int a = arr1[i];
            int count =0;
            for(int j =0;j<arr2.length;j++){
                if(Math.abs(a-arr2[j])>d){
                    count+=1;
                }
            }
            if(count == arr2.length){
                b+=1;
            }
        }
        return b;
    }
}