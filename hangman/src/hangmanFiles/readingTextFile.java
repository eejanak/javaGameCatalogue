package hangmanFiles;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class readingTextFile {
    public String[] wordReader() {
        String wordsList[] = new String[0];
        try {
            InputStream fis = readingTextFile.class.getResourceAsStream("/resources/randomWordList");
            assert fis != null;
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(isr);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                wordsList = line.split(" ");
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsList;
    }
}
