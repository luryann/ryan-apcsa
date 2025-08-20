import java.util.Scanner;

class Main
  {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      String name1, name2, name3, name4;
      
      System.out.println("Please enter four names:");
      
      // System.out.println("Enter the first name");
      name1 = scan.nextLine();
      // System.out.println("Enter the second name");
      name2 = scan.nextLine();
      // System.out.println("Enter the third name");
      name3 = scan.nextLine();
      // System.out.println("Enter the fourth name");
      name4 = scan.nextLine();
      
      System.out.println(name4 + " " + name2 + " " + name3 + " " + name1);
    }
  }
