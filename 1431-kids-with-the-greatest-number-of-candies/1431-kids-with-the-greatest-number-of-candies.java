class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
       int max = candies[0];
       for(int i:candies){
        if(max<i){
            max = i;
        }
       }
       for(int j:candies){
        if(j+extraCandies>=max){
            arr.add(true);
        }
        else{
            arr.add(false);
        }
       }
       return arr;
    }
}