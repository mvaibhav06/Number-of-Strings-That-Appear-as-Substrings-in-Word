public class StringPatterns {
    public int numOfStrings(String[] patterns, String word) {
        int out = 0;
        for(int i=0; i<patterns.length; i++){
            if(word.contains(patterns[i])){
                out++;
            }
        }
        return out;
    }
}
