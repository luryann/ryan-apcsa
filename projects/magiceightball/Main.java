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

    public static String getAResponse() {
        String responses = "It is certain,Most likely,Ask again later,Outlook not so good,Yes,No";
        int randomNum = (int) (Math.random() * 6) + 1; // 1-6 inclusive

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
