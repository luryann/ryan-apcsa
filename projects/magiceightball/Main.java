// No arrays
// No conditionals

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ask a question or type 'quit' to exit.");
    
        String question = "";
        while (true) {
            System.out.print("\nYour question: ");
            question = input.nextLine();

            if (question.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            // Call the method to get a random answer
            String answer = getRandomAnswer();
            System.out.println("Magic Eight Ball says: " + answer);
        }

        input.close();
    }

    // Method that returns one of six possible responses
    public static String getRandomAnswer() {
        String responses =
            "It is certain|" +
            "Most likely|" +
            "Ask again later|" +
            "Outlook not so good|" +
            "Yes|" +
            "No";

        int randomIndex = (int) (Math.random() * 6); // pick 0-5 (6 total)
        String[] parts = responses.split("\\|");
        return parts[randomIndex];
    }
}
