package hangmanFiles;

import hangmanFiles.readingTextFile;

public class test {
    public static void main(String[] args) {
        readingTextFile r = new readingTextFile();
        String[] list = r.wordReader();
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);
//        r.main(list);
    }
}
