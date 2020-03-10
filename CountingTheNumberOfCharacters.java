import java.util.Scanner;

class CountingTheNumberOfCharacters
{
   public static void main(String args[])
   {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter string");
      
      String userString = userInput.nextLine();
      
      System.out.println("Length of string is: " + userString.length());
     
   }
}