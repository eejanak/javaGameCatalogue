package hangmanFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanPlayAgain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("\nWelcome to hangman!");
        System.out.println("What is your name?");
        String n = console.next();
        System.out.println("Hello " + n + ", we are going to play hangman today.");
        System.out.println("Are you ready to play?");
        console.next();

        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("\n");

        int play = 1;

        while (play == 1) {

            String w = getWord();

            System.out.println("The word is " + w.length() + " letters long");
            String[] wordGuess = new String[w.length()];
            for (int i = 0; i < w.length(); i++) {
                wordGuess[i] = "-";
            }

            System.out.println(Arrays.toString(wordGuess));
            boolean playing = true;
            int wrongG;
            int correctCount = 0;
            int wrongCount = 0;
            if (w.length() > 10) {
                wrongG = 10;
            } else if (w.length() > 5) {
                wrongG = 6;
            } else {
                wrongG = 3;
            }
            System.out.println("You will get " + wrongG + " wrong guesses, as the word is " + w.length() + " letters long");
            System.out.println("Press any letter to continue");
            console.next();

            ArrayList<String> alreadyGuessed = new ArrayList<String>();

            System.out.println();
            for (int i = 0; i < 100; i++) {
                System.out.print("-");
            }
            System.out.println("\n");

            while (playing) {
                System.out.println("You have already guessed the letters " + alreadyGuessed);
                System.out.println("Please pick a letter ");
                String guess = console.next();
                if (alreadyGuessed.contains(guess)) {
                    System.out.println("You have already guessed the letter " + guess);
                } else {
                    alreadyGuessed.add(guess);
                    if (w.contains(guess)) {
                        System.out.println("The word contains " + guess);
                        for (int i = 0; i < w.length(); i++) {
                            String check = w.substring(i, i + 1);
                            if (check.equals(guess)) {
                                wordGuess[i] = guess;
                                correctCount++;
                            }
                        }
                    } else {
                        System.out.println("The mystery word does not contain " + guess);
                        wrongCount++;
                    }
                    System.out.println("You have used up " + wrongCount + " of " + wrongG + " wrong guesses.");
                    System.out.println(Arrays.toString(wordGuess));
                    for (int i = 0; i < 100; i++) {
                        System.out.print("-");
                    }
                    System.out.println("\n");
                }
                if (correctCount < w.length()) {
                    if (wrongCount >= wrongG) {
                        playing = false;
                    }
                } else {
                    playing = false;
                }
            }
            System.out.println(Results(correctCount, w.length(), wrongCount, wrongG, w));
            play = replay();
        }
    }

    public static String Results(int cCount, int length, int wCount, int wCountAllowed, String word) {
        if (cCount == length) {
            return "You won! You guessed the word " + word + " with only " + wCount + " incorrect guesses (for a total of " + (cCount + wCount) + " guesses, which was " + (wCountAllowed - wCount) + " less than the max number of wrong guesses you could have had).";
        } else {
            return "You lost. Although you got " + cCount + " of the " + length + " letters, the correct word was " + word + " and you used up all " + wCountAllowed + " attempts. ";
        }
    }

    public static int replay () {
        Scanner ask = new Scanner(System.in);
        System.out.println("To play again, press 1. To quit, press 0.");
        return ask.nextInt();
    }

    public static String getWord() {
        String words = "abruptly absurd abyss affix askew avenue awkward axiom azure bagpipes bandwagon banjo bayou beekeeper bikini blitz blizzard boggle bookworm boxcar boxful buckaroo buffalo buffoon buxom buzzard buzzing buzzwords caliph cobweb cockiness croquet crypt curacao cycle daiquiri dirndl disavow dizzying duplex dwarves embezzle equip espionage euouae exodus faking fishhook fixable fjord flapjack flopping fluffiness flyby foxglove frazzled frizzled fuchsia funny gabby galaxy galvanize gazebo giaour gizmo glowworm glyph gnarly gnostic gossip grogginess haiku haphazard hyphen iatrogenic icebox injury ivory ivy jackpot jaundice jawbreaker jaywalk jazziest jazzy jelly jigsaw jinx jiujitsu jockey jogging joking jovial joyful juicy jukebox jumbo kayak kazoo keyhole khaki kilobyte kiosk kitsch kiwifruit klutz knapsack larynx lengths lucky luxury lymph marquis matrix megahertz microwave mnemonic mystify naphtha nightclub nowadays numbskull nymph onyx ovary oxidize oxygen pajama peekaboo phlegm pixel pizazz pneumonia polka pshaw psyche puppy puzzling quartz queue quips quixotic quiz quizzes quorum razzmatazz rhubarb rhythm rickshaw schnapps scratch shiv snazzy sphinx spritz squawk staff strength strengths stretch stronghold stymied subway swivel syndrome thriftless thumbscrew topaz transcript transgress transplant triphthong twelfth twelfths unknown unworthy unzip uptown vaporize vixen vodka voodoo vortex voyeurism walkway waltz wave wavy waxy wellspring wheezy whiskey whizzing whomever wimpy witchcraft wizard woozy wristwatch wyvern xylophone yachtsman yippee yoked youthful yummy zephyr zigzag zigzagging zilch zipper zodiac zombie";
        String[] wordList = words.split(" ");
        int index = (int) (Math.random() * wordList.length);
        return wordList[index];
    }
}
