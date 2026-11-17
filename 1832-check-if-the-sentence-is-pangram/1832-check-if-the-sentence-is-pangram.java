class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hash = new HashSet<>();
        if(sentence.length()<26){
            return false;
        }
        for(int i =0;i<sentence.length();i++){
            hash.add(sentence.charAt(i));
        }
        return hash.size()==26;
    }
}