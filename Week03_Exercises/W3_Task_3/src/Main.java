import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user_input;
        StringBuilder reverse_sentences = new StringBuilder();

        System.out.println("Enter an Sentence : ");
        Scanner scan = new Scanner(System.in);
        user_input = scan.nextLine();

        String[] words = user_input.split(" ");

        for (String word : words){
            StringBuilder reverse_word = new StringBuilder(word);
            reverse_word.reverse();
            reverse_sentences.append(reverse_word).append(" ");

        }

        System.out.println("Reversed Sentences : "+reverse_sentences.toString().trim());




    }

}