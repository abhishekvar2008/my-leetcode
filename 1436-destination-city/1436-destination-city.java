class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hash = new HashSet<>();
        for(int i =0 ;i<paths.size();i++){
            hash.add((paths.get(i)).get(0));
        }
        for(int j =0;j<paths.size();j++){
            if(!hash.contains((paths.get(j)).get(1))){
                return paths.get(j).get(1);
            }
        }
        return "";
    }
}