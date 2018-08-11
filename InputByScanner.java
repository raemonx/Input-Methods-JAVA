import java.util.Scanner;
public class InputByScanner{
   public static void main(String args[]) {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter your name ");
    String name=keyboard.nextLine();
    System.out.println("Your Name is: "+name);
  }
}
