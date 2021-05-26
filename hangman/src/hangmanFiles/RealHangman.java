package hangmanFiles;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RealHangman {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = name.next();
        System.out.println("Hello " + n + ", we are going to play hangman today.");
        String words = "abruptly absurd abyss affix askew avenue awkward axiom azure bagpipes bandwagon banjo bayou beekeeper bikini blitz blizzard boggle bookworm boxcar boxful buckaroo buffalo buffoon buxom buzzard buzzing buzzwords caliph cobweb cockiness croquet crypt curacao cycle daiquiri dirndl disavow dizzying duplex dwarves embezzle equip espionage euouae exodus faking fishhook fixable fjord flapjack flopping fluffiness flyby foxglove frazzled frizzled fuchsia funny gabby galaxy galvanize gazebo giaour gizmo glowworm glyph gnarly gnostic gossip grogginess haiku haphazard hyphen iatrogenic icebox injury ivory ivy jackpot jaundice jawbreaker jaywalk jazziest jazzy jelly jigsaw jinx jiujitsu jockey jogging joking jovial joyful juicy jukebox jumbo kayak kazoo keyhole khaki kilobyte kiosk kitsch kiwifruit klutz knapsack larynx lengths lucky luxury lymph marquis matrix megahertz microwave mnemonic mystify naphtha nightclub nowadays numbskull nymph onyx ovary oxidize oxygen pajama peekaboo phlegm pixel pizazz pneumonia polka pshaw psyche puppy puzzling quartz queue quips quixotic quiz quizzes quorum razzmatazz rhubarb rhythm rickshaw schnapps scratch shiv snazzy sphinx spritz squawk staff strength strengths stretch stronghold stymied subway swivel syndrome thriftless thumbscrew topaz transcript transgress transplant triphthong twelfth twelfths unknown unworthy unzip uptown vaporize vixen vodka voodoo vortex voyeurism walkway waltz wave wavy waxy wellspring wheezy whiskey whizzing whomever wimpy witchcraft wizard woozy wristwatch wyvern xylophone yachtsman yippee yoked youthful yummy zephyr zigzag zigzagging zilch zipper zodiac zombie";
        String[] wordList = words.split(" ");
        int index = (int) (Math.random()* wordList.length);
        System.out.println(wordList[index]);
        for (String word : wordList) {
            System.out.print(word + ", ");
        }
        String w = wordList[index];
        String [] letters = new String[w.length()];
        for (int i = 0; i < w.length(); i++) {
            letters [i] = w.substring(i, i+1);
        }

        System.out.println("The word is " + w.length() + " letters long");
        String [] wordGuess = new String[w.length()];
        for (int i = 0; i < w.length(); i++) {
            wordGuess [i] = "-";
        }

        System.out.println(Arrays.toString(wordGuess));
        boolean playing = true;
        int wrongG;
        int correctCount = 0;
        int wrongCount = 0;
        if (w.length()>10) {
            wrongG = 10;
        } else if (w.length()>5) {
            wrongG = 6;
        } else {
            wrongG = 3;
        }
        System.out.println("You will get " + wrongG + " wrong guesses, as the word is " + w.length() + " letters long");

        ArrayList <String> alreadyGuessed = new ArrayList<String>();
        while (playing)  {
            System.out.println("You have already guessed the letters " + alreadyGuessed);
            System.out.println("Please pick a letter ");
            String guess = name.next();
            alreadyGuessed.add(guess);
            if (w.contains(guess)) {
                System.out.println("The word contains " + guess);
                for (int i = 0; i < w.length (); i++) {
                    String check = w.substring(i, i+1);
                    System.out.println(check);
                    if (check.equals(guess)) {
                        wordGuess[i] = guess;
                        correctCount++;
                    }
                }
                System.out.println(Arrays.toString(wordGuess));
                for (int i = 0; i < 100; i++) {
                    System.out.print("-");
                }
                System.out.println("\n");
            } else {
                System.out.println(w + " does not contain " + guess);
                System.out.println(Arrays.toString(wordGuess));
                for (int i = 0; i < 100; i++) {
                    System.out.print("-");
                }
                System.out.println("\n");
                wrongCount++;
            }
            if (correctCount < w.length() ) {
                if (wrongCount >= wrongG) {
                    playing = false;
                }
            } else {
                playing = false;
            }
        }
        System.out.println (Results (correctCount, w.length(), wrongCount, wrongG, w));
    }

    public static String Results(int cCount, int length, int wCount, int wCountAllowed, String word) {
        if (cCount == length) {
            return "You won! You guessed the word " + word + " with only " + wCount + " incorrect guesses (for a total of " + (cCount+wCount) + " guesses, which was " + (wCountAllowed - wCount) + " less than the max number of wrong guesses you could have had).";
        } else {
            return "You lost. Although you got " + cCount + " of the " + length + " letters, the correct word was " + word + " and you used up all " + wCountAllowed + " attempts. ";
        }
    }
}
