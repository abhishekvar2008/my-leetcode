class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] a ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hash = new HashSet<>();
        for(String b : words){
            StringBuilder s = new StringBuilder();
            for(int i =0;i<b.length();i++){
                s.append(a[b.charAt(i)-'a']);
            }
            hash.add(s.toString());
        }
        return hash.size();
    }
}