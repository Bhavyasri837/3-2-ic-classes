import java.util.Scanner;
public class count_of_words_in_sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);
    }
}
