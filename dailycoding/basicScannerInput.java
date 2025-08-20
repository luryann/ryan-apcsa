import java.util.Scanner;

public class Main
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      String example1, example2; 
      
      /*
      You can stack then like this, or like
      String example1;
      String example2;
      String example3;
      */
      
      System.out.println("Sample line");
      example1 = scan.nextLine();
      example2 = scan.nextLine();
      System.out.println(example1 + " " + example2);
    }
  }
