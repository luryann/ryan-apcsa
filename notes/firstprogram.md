# First Program

The Java code in U1_L2_Activity_One.java is a simple program that demonstrates how to get text input from a user. It prompts the user to enter their favorite food, reads the typed input, and then prints a message with the user's provided input. 

```java

/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class UsingScanner 
{
  public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter your favorite food: "); 
        String favoriteFood = scanner.nextLine(); 
        System.out.println("I like to eat " + favoriteFood + " as well!");
        scanner.close(); 
  }
}
```
