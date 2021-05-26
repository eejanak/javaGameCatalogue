package hangmanFiles;

public class hangmanTestCode {
    public static void main(String[] args) {
        String word = "this";
        String[] wordSplit = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordSplit[i] = word.substring(i, i+1);
        }
        for (String letter : wordSplit) {
            System.out.println(letter);
        }
    }
}
