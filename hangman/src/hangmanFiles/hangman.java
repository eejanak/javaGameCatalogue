package hangmanFiles;
import hangmanFiles.readingTextFile;
import java.util.Random;

public class hangman {
    public static void main(String[] args) {
        readingTextFile r = new readingTextFile();
        String[] list = r.wordReader();
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);
//        r.main(list);
        Random rand = new Random();
        for (int i = 0; i < list.length; i++) {
            double index = Math.floor(Math.random() * (list.length));
            System.out.println(list[(int) (index)]);
        }
    }
}
