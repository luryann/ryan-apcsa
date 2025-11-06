import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ask a question or type 'quit' to exit.");

        while (true) {
            System.out.print("\nYour question: ");  // use print, not println
            String question = input.nextLine().trim();  // trim whitespace

            if (question.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            // Only give a response if the user typed something
            if (!question.isEmpty()) {
                String answer = getRandomAnswer();
                System.out.println("Magic Eight Ball says: " + answer);
            } else {
                System.out.println("Please ask a question.");
            }
        }

        input.close();
    }

    public static String getRandomAnswer() {
        String responses = "It is certain,"
                + "It is decidedly so,"
                + "Without a doubt,"
                + "Yes definitely,"
                + "You may rely on it,"
                + "As I see it, yes,"
                + "Most likely,"
                + "Outlook good,"
                + "Yes,"
                + "Signs point to yes,"
                + "Reply hazy, try again,"
                + "Ask again later,"
                + "Better not tell you now,"
                + "Cannot predict now,"
                + "Concentrate and ask again,"
                + "Don't count on it,"
                + "My reply is no,"
                + "My sources say no,"
                + "Outlook not so good,"
                + "Very doubtful";

        int randomNum = (int) (Math.random() * 20) + 1; // 1-20 inclusive

        int start = 0;
        int end = responses.indexOf(',');

        for (int i = 1; i < randomNum; i++) {
            start = end + 1;
            end = responses.indexOf(',', start);
            if (end == -1) end = responses.length();
        }

        return responses.substring(start, end);
    }
}
